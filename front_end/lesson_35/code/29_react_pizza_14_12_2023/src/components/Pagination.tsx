import React from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { selectFilter, setCurrentPage } from '../redux/slices/filterSlice'

const Pagination = () => {
    const { currentPage } = useSelector(selectFilter);
    const dispatch = useDispatch(); 
  return (
    <section className='pagination'>
        <ul className='pagination__list'>
            <li className='pagination__item'>
                <button
                    onClick={() => dispatch(setCurrentPage(currentPage - 1))}
                    disabled={currentPage === 1}
                    className={`pagination__button ${currentPage === 1 ? 'button_disabled' : ''} button button_type_primary-outlined`}
                >
                    &lt;
                </button>
            </li>
            <li>
                <button
                    onClick={() => dispatch(setCurrentPage(1))}
                    className={`pagination__button ${currentPage === 1 ? 'pagination__button_active' : ''} button button_type_primary-outlined`}
                >1</button>
            </li>
            <li>
                <button
                    onClick={() => dispatch(setCurrentPage(2))}
                    className={`pagination__button ${currentPage === 2 ? 'pagination__button_active' : ''} button button_type_primary-outlined`}
                >2</button>
            </li>
            <li>
                <button
                    onClick={() => dispatch(setCurrentPage(currentPage + 1))}
                    disabled={currentPage === 2}
                    className={`pagination__button ${currentPage === 2 ? 'button_disabled' : ''} button button_type_primary-outlined`}
                >
                    &gt;
                </button>
            </li>
        </ul>
    </section>
  )
}

export default Pagination