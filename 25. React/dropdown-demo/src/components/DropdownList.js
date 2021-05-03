import { React } from 'react';
import "./DropdownList.css"

const DropdownList = (props)=>{
    return (
        <li onClick={props.onSelect} >{props.text}</li>
    )
}

export default DropdownList;