import { useState } from 'react'
import './App.css'
import UseStateComponent from './components/UseStateComponent'
import UseReducerComponent from './components/UseReducerComponent'
function App() {
  
  return (
    <>
      <h1>Demonstrating Different React Hooks!</h1>

      <UseStateComponent/>
      <UseReducerComponent/>
    </>
  )
}

export default App
