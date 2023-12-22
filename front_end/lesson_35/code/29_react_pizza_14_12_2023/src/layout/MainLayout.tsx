import React, { useEffect, useState } from 'react'
import Header from '../components/Header'
import { Outlet } from 'react-router-dom'

const MainLayout: React.FC = () => {
    const [isVisible, setIsVisible] = useState<boolean>(false);

    function visibleToTop() {
        setIsVisible(window.scrollY >= 40);
    }

    useEffect(() => {
        document.addEventListener('scroll', visibleToTop);
        return () => {
            document.removeEventListener('scroll', visibleToTop);
        };
    }, [])

  return (
    <div className='container'>
        <Header />
        <main className='content'>
            <Outlet />
        </main>
        <button
            className={`button button_type_primary to-top ${isVisible ? 'to-top_visibled' : ''}`}
            onClick={() => window.scrollTo(0, 0)}
        ></button>
    </div>
  )
}

export default MainLayout