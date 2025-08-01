import { useState } from 'react'
import './App.css'
import UseStateComponent from './components/UseStateComponent'
import UseReducerComponent from './components/UseReducerComponent'
import UseMemComponent from './components/UseMemComponent'
function App() {
  
  return (
    <>
      <h1>Demonstrating Different React Hooks!</h1>

      <UseStateComponent/>
      <UseReducerComponent/>
      <UseMemComponent/>
    </>
  )
}

export default App
