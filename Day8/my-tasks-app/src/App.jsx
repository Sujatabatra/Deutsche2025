import { useState } from 'react'
import './App.css'
import Todo from './components/Todo'
import Form from './components/Form'
import FilterButton from './components/FilterButton'
import {nanoid} from 'nanoid'

function App(props) {
  const [tasks, setTasks] = useState(props.tasks);

  
function toggleTaskCompleted(id) {
  console.log(tasks[0]);
}
  
  const taskList = tasks?.map((task) => (
  <Todo
    id={task.id}
    name={task.name}
    completed={task.completed}
    key={task.id}
    toggleTaskCompleted={toggleTaskCompleted}
  />
));

function addTask(name) {
  const newTask = { id: `todo-${nanoid()}`, name, completed: false };
  setTasks([...tasks, newTask]);
}

  return (
    <div className="todoapp stack-large">
      <h1>TodoMatic</h1>
      <Form addTask={addTask}/>
      <div className="filters btn-group stack-exception">
        <FilterButton name="All" pressed />
        <FilterButton name="Active"/>
        <FilterButton name="Completed"/>
      </div>
      <h2 id="list-heading">{taskList.length} tasks remaining</h2>
      <ul
        role="list"
        className="todo-list stack-large stack-exception"
        aria-labelledby="list-heading">
        {/* <Todo name="Eat" id="todo-0" completed />
        <Todo name="Sleep" id="todo-1" />
        <Todo name="Repeat" id="todo-2" /> */}
      {taskList}

      </ul>
    </div>
  );
}

export default App;
