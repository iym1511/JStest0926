import { useState } from "react";
import { useEffect } from "react";

// Ajax를 사용하여 localhost:8080에 접근하여 값을 가져옴
const DBBox = () => {
    const [data, setData] = useState();
    const [search, setSearch] = useState("11");

    useEffect( ()=>{
            // 실행하자마자 값을 가져옴
            async function fetchData() {
            const response = await fetch(`/JavaTest/selectProduct.jsp?TestName=${search}`);
            const data = await response.json()
        }   
        fetchData();
    })
    return (  
        <div>
            <h1>DBBox 컴포넌트가 실행</h1> 
            {data ? data.name: "가져오는중"}
        </div>
    );
}
 
export default DBBox;
