import axios from 'axios'
import React from 'react'
import { Dao, UserRegister } from '../gateway/Dao'

export default function Login() {

    const OnRegister : React.FormEventHandler<HTMLFormElement> = event => {
        const user : UserRegister = {
            username : "asch",
            email    : "123@123.com",
            password : "12345678"
        }
        const message = Dao("POST", user)
        axios.post("http://localhost:8080/harmony/api/loginService", message).then( res => {
            console.log("Resposse")
            console.log(res);
        })
    }


    return (
        <form onSubmit={OnRegister}>
            <input type="text" />
            <input type="text" />
            <button>register</button>
        </form>
    )
}
