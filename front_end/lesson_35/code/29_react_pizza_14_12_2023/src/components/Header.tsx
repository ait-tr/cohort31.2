import React from 'react'
import Logo from './Logo'
import HeaderCart from './HeaderCart'
import SearchForm from './SearchForm'

const Header: React.FC = () => {
  return (
    <header className='header'>
        <div className='header__row'>
          <Logo className='header__logo' />
          <HeaderCart />
        </div>
        <SearchForm />
    </header>
  )
}

export default Header