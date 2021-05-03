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


export default Badge;