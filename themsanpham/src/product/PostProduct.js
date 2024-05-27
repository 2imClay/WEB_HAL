 
import Button from "react-bootstrap/Button";
import { useState } from "react";
import Form from 'react-bootstrap/Form';
import { useNavigate } from "react-router-dom";

const PostProduct = () => {
    const [formData, setFormData] = useState({
        name: "",
        description: "",
        price: ""
    });
{/**5.	AddProductPage gọi hàm handleInputChange để cập nhật dữ liệu đã nhập vào các trường. */}
    const handleInputChange = (event) => {
        const { name, value } = event.target;
        setFormData({
            ...formData,
            [name]: value,
        });
    }

    const navigate = useNavigate();
{/**7.	AddProductPage gọi hàm handleSubmit khi quản trị viên ấn “Submit” để gửi dữ liệu sản phẩm tới API ‘http://localhost:8080/api/product’ với phương thức POST dưới dạng JSON. 
12.	AddProductPage gọi hàm handleSubmit hiện thị kết quả gồm thông tin sản phẩm dưới dạng json cùng với kết quả thêm sản phẩm thành công.*/}
    const handleSubmit = async (e) => {
        e.preventDefault();
        console.log(formData);
        try {
            const response = await fetch("http://localhost:8080/api/product", {
                method: "POST",
                headers: { "Content-Type": "application/json" },
                body: JSON.stringify(formData)
            });
            const data = await response.json();
            console.log("Product created", data);
            navigate("/");
        } catch (error) {
            console.log("Error creating product", error.message);
        }
    }

    return (
        <>
            <div className="center-form">
               
                <h1>Post Product</h1> 
                {/**3.	Hệ thống hiển thị một biểu mẫu trống gồm tên, mô tả và giá để quản trị viên nhập thông tin sản phẩm mới.

 */}
                <Form onSubmit={handleSubmit}>
                    <Form.Group controlId="formBasicName">
                        <Form.Control
                            type="text"
                            name="name"
                            placeholder="Enter name"
                            value={formData.name}
                            onChange={handleInputChange}
                        />
                    </Form.Group>
                    <Form.Group controlId="formBasicDescription">
                        <Form.Control
                            type="text"
                            name="description"
                            placeholder="Enter description"
                            value={formData.description}
                            onChange={handleInputChange}
                        />
                    </Form.Group>
                    <Form.Group controlId="formBasicPrice">
                        <Form.Control
                            type="text"
                            name="price"
                            placeholder="Enter price"
                            value={formData.price}
                            onChange={handleInputChange}
                        />
                    </Form.Group>
                   
                    <Button variant="primary" type="submit" className="w-100">Submit</Button>
                </Form>
            </div>
        </>
    )
}

export default PostProduct;
