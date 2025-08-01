import { act } from "react";
import { useReducer } from "react";

const counterReducer=(state,action)=>{
    switch(action.type){
        case 'INCREMENT':
            return {count :state.count+1};
        case 'DECREMENT':
            return {count :state.count-1};
        default:
            return state;
    }
}
function UseReducerComponent(){
    const [state,dispatch]=useReducer(counterReducer,{count:0});
    
    return(
        <>
        <h1>Demonstrating useReducer</h1>
        <p>Count : {state.count}</p>
        <div>
            <button onClick={()=>dispatch({type:'INCREMENT'})}>Increment</button>
            <button onClick={()=>dispatch({type:'DECREMENT'})}>Decrement</button>
        </div>
        </>
    )
}

export default UseReducerComponent;