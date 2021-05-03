import { useState } from "react";
import DropdownList from "./DropdownList";

function Dropdown() {
  // const states=["Delhi", "Punjab", "MadhyaPradesh", "Rajasthan"]
  const [states] = useState(["Delhi", "Punjab", "MadhyaPradesh", "Rajasthan"])
  // let flag = true;

  const [flag, setFlag] = useState(false);
  // let selectedState = "";
  const [selectedState, setSelectedState] = useState("");



  // way1
  // const selectState = (event)=>{
  //   console.log(event.target)
  //   console.log(event.target.textContent)
  // }
  // way2
  const selectState = (state)=>{
    console.log(state);
    setSelectedState(state);
    setFlag(!flag);
  }
  const toggleListFlag = ()=>{
    // flag = !flag;
    setFlag(!flag);
    

    console.log(flag)
  }
  return (
    <div>
      <h1>Dropdown Demo</h1>
      <span style={{border:"1px solid black", padding: "5px 50px"}} onClick={toggleListFlag}>{selectedState||'Select your state'}</span>
      <ul>
        {/* create list */}
        {/* <li onClick={()=>{selectState('Delhi')}}>Delhi</li>
        <li onClick={()=>{selectState('Punjab')}}>Punjab</li>
        <li onClick={()=>{selectState('MP')}}>MP</li> */}

        {/* {flag ? 'Yes':'No'} */}
        {flag && states.map((state, index)=>{
          {/* return <li onClick={selectState}>{state}</li> */}
          {/* return <li key={index} onClick={()=>{selectState(state)}}>{state}</li> */}
          return <DropdownList key={index} onSelect={()=>{selectState(state)}} text={state} />
        })}

        
      </ul>

    </div>
  );
}

export default Dropdown;
