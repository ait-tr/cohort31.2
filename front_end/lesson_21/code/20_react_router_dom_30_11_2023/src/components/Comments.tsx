import React, { useState, useEffect } from 'react'
import Comment from './Comment';

export interface IComment {
    email: string;
    body: string;
}

const Comments = () => {
    // Хранение данных
    const [comments, setComments] = useState< IComment[] | null >(null);
    
    // Получение данных
    useEffect(() => {
        fetch('https://jsonplaceholder.typicode.com/comments')
            .then(response => response.json())
            .then(data => setComments(data))
    })

    // Отображение данных
    return (
        <ul>
            {comments?.map(({ body, email }, index) => (
                <Comment key={index} body={body} email={email} />
                ))}
        </ul>
    )
}

export default Comments