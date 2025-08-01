import {useState, useMemo } from "react";

function UseMemComponent(){

    const [count,setCount]=useState(0);
    const [text,setText]=useState("");

    const expensiveCalculation=useMemo(
        ()=>{
            console.log("Expensive Calculation");
            return count*2;
        },
        [count]
    );
    return(
        <>
        <h1>Demonstrating useMemo Hook</h1>
        <p>Count : {count}</p>
        <p>Expensive Calculation : {expensiveCalculation}</p>

        <button onClick={()=>setCount(count+1)}>Increment</button>
        <input type="text" value={text}
        onChange={(e)=>setText(e.target.value)}
        placeholder="Type Something"/>

        </>
    )
}
export default UseMemComponent;