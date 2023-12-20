import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { onClickCategory, selectFilter } from '../redux/slices/filterSlice'

const Categories = () => {
    const {categoryNames, categoryId} = useSelector(selectFilter);
    const dispatch = useDispatch();

  return (
    <ul>
        {categoryNames.map((name, index) => (
            <li key={index}>
                <button
                    type='button'
                    className={`${categoryId === index ? 'categories__button_active' : ''}`}
                    onClick={() => dispatch(onClickCategory(index))}
                >
                    {name}
                </button>
            </li>
        ))}
    </ul>
  )
}

export default Categories