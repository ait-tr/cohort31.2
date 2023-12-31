import React from 'react'
import { useSelector } from 'react-redux'
import { selectItemsData } from '../redux/slices/itemsSlice'
import Card from './Card';
import Skeleton from './Skeleton';

const Cards: React.FC<{ title: string }> = ({ title }) => {
    const { items, status } = useSelector(selectItemsData);

  return (
    <div className='cards'>
        <h2 className='title cards__title'>{title}</h2>
        {
            status === 'error' ? (
                <p className='cards__error'>Данные не загрузились. Попробуйте зайти позже</p>
            ) : (
                <div className='cards__list'>
                    {
                        status === 'loading' ?
                        new Array(8).map((_, index) => <Skeleton key={index} />) :
                        items.map(item => <Card {...item} key={item.id} />)
                    }
                </div>
            )
        }
    </div>
  )
}

export default Cards