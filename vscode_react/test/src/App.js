import Hello from "./Hello";
import './App.css';
import Wrapper from "./Wrapper";
import UserCard from "./UserCaed";
function App(){
  
  return( 
    <UserCard name="Alice" age={30} location="New York"/>
  );

}
export default App;