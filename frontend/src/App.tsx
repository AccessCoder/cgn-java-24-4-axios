
import './App.css'
import {useEffect, useState} from "react";
import axios from "axios";

function App() {
  const [name, setName] = useState<string>("")
  const [story, setStory] = useState<string>("")



  useEffect(() => {
    axios.get("/api/dog", )
        .then(currywurst => setName(currywurst.data))
        //Alles was 4xx oder 5xx ist, wird "abgefangen"
        .catch(error => console.log(error))

    axios.get("/api/dog/story")
        .then(currywurst => setStory(currywurst.data))
        //Alles was 4xx oder 5xx ist, wird "abgefangen"
        .catch(error => console.log(error))

    axios.post("/api/dog", "He has a good day")
        .then(currywurst => setStory(currywurst.data))
        //Alles was 4xx oder 5xx ist, wird "abgefangen"
        .catch(error => console.log(error))
  },[])

  return (
    <>
        <h2>My Dog: {name}, this is his Story: {story}</h2>
    </>
  )
}

export default App
