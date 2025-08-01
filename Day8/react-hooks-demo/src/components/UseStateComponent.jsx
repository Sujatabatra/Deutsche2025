import { useState } from "react";
//useState is declaraing state
function UseStateComponent(){

    const [count,setCount]=useState(10);

    const increment=()=>setCount(count+1);

    const decrement=()=>setCount(count-1);

    return(
        <>
        <h1>Demonstrating useState</h1>
        <h1>Count : {count}</h1>

        <button onClick={increment}>Increment</button>
        <button onClick={decrement}>Decrement</button>
        </>
    )
}

export default UseStateComponent;