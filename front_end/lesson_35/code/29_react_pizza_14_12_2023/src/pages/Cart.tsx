import React from "react";
import { useDispatch, useSelector } from "react-redux";
import { removeAllItems, selectCart } from "../redux/slices/cartSlice";
import { Link } from "react-router-dom";
import CartCard from "../components/CartCard";
import { selectItemsData } from "../redux/slices/itemsSlice";

const Cart = () => {
  const { items, totalPrice } = useSelector(selectCart);
  const { items: itemsList } = useSelector(selectItemsData);
  const totalCount = items.reduce((acc, item) => acc + item.count, 0);

  const dispatch = useDispatch();
  return (
    <div className="cart">
      {items.length > 0 ? (
        <>
          <div className="cart__row cart__header">
            <h1 className="title cart__title">Корзина</h1>
            <button
              type="button"
              className="cart__button-clear button button_type_primary"
              onClick={() => dispatch(removeAllItems())}
            >
              Очистить корзину
            </button>
          </div>
          <div className="cart__cards">
            {items.map((item) => {
              const product = itemsList.find(itemList => item.id === itemList.id)
              return (product && <CartCard key={item.id} {...product} {...item}/>)
            })}
          </div>
          <div className="cart__row cart__footer">
            <p className="cart__text">
              Всего пицц:
              <span className="cart__text-label">{totalCount} шт.</span>
            </p>
            <p className="cart__text">
              Сумма заказа:
              <span className="cart__text-label">{totalPrice} ₽</span>
            </p>
          </div>
          <div className="cart__row cart__footer">
            <Link to="/" className="button button_type_light cart__button">
              Вернуться назад
            </Link>
            <a
              href="#"
              className="button button_type_primary-outlined cart__button"
            >
              Оплатить
            </a>
          </div>
        </>
      ) : (
        <div className="cart__empty">
          <h1 className="title cart__empty-title">Корзина пуста ☹️</h1>
          <p className="cart__empty-descr">
            Вероятней всего, вы не заказывали ещё пиццу. Для того, чтобы
            заказать пиццу, перейди на главную страницу.
          </p>
          <Link
            to="/"
            className="cart__empty-button button button_type_primary"
          >
            Вернуться назад
          </Link>
        </div>
      )}
    </div>
  );
};

export default Cart;
