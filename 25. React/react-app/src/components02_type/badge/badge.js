import { PropTypes } from "prop-types";
/* 
import React from 'react'; 

class Badge extends React.Component{
    render(){
        ---> actual view
    }
}
 */

const Badge = (props)=>{
    // const doTask = ()=>{
    //     console.log("clicked");
    // }
    return (
        <button style={{
            backgroundColor: props.backgroundColor,
            color: props.color
        }} 
        onClick={props.myMethod}
            >{props.text} 
            <span>
                {props.count}
            </span>
        </button>
    )
}

Badge.defaultProps = {
    backgroundColor: "black",
    color: "white",
    count: 10,
    text: "Badge"
}

Badge.propTypes = {
    backgroundColor: PropTypes.string,
    color: PropTypes.string,
    count: PropTypes.number,
    text: PropTypes.string,
    myMethod: PropTypes.func
}


export default Badge;