import React from 'react'
import { Item, selectItemsData, setItem } from '../redux/slices/itemsSlice'
import { useDispatch, useSelector } from 'react-redux'
import { addToCart, selectCartItemById } from '../redux/slices/cartSlice'
import { selectFilter } from '../redux/slices/filterSlice'
import ParamsBlock from './ParamsBlock'
import { ReactComponent as StarIcon} from '../assets/images/star_icon.svg';
import { Link } from 'react-router-dom'

const Card: React.FC<Item> = ({ id, reviews, category, info, images, price, rating, title, sizes, types }) => {
  const counter = useSelector(selectCartItemById(id));
  const count: number | undefined = counter && counter.count;
  const { activeSize, activeType } = useSelector(selectItemsData);
  const { categoryName } = useSelector(selectFilter);
  const isCategoryClose = categoryName === 'Закрытые';
  const dispatch = useDispatch();

  const cardItem: Item = {
    id,
    title,
    price,
    images,
    sizes,
    types,
    rating,
    info,
    category,
    reviews
  }
  
    return (
    <div className={`card ${isCategoryClose ? 'card_disabled' : ''}`}>
        <div className='card__rating'>
            <StarIcon className='card__rating-icon' />
            <span className='card__rating-text'>{rating}</span>
        </div>
        <img className='card__image' src={images[0]} alt={title} />
        <h2 className='card__title' onClick={() => dispatch(setItem(cardItem))}>
            <Link
                to={`/pizza/${id}`}
                onClick={() => dispatch(setItem(cardItem))}
                className='card__link'
            >
                {title}
            </Link>
        </h2>
        <ParamsBlock className='card__params-block' types={types} sizes={sizes}/>
        <div className='card__footer'>
            <span className='card__price'>от {price} ₽</span>
            <button
                className='card__button button button_type_primary-outlined'
                onClick={() => dispatch(addToCart(cardItem))}
            >
                <span className='card__button-icon'>+</span>
                Добавить
                { count && <span className='card__button-counter'>{count}</span> }
            </button>
        </div>
    </div>
  )
}

export default Card