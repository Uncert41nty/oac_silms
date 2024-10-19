import { useState } from "react";
import './MyCourses.css';

const MyCourses = () => {

    const [courses, setCourses] = useState([
        {id: 1, title: "Аналитика данных", desription: "Курс по основам аналитики данных" },
        {id: 2, title: "Инжерия ПО", desription: "Курс для повышения уровня знаний и квалификации в разработке ПО" },
        {id: 3, title: "Системный администратор", desription: "Курс для повышения квалификации должности Системного администратора" }
    ]);

    return ( 
        <div className="courseListContainer">
            <h1 className="yourCoursesText">Ваши курсы</h1>
            {courses.map((course) => (
            <div key={course.id} className="course">
                <h2 className="courseTitle">{course.title}</h2>
                <p className="courseDescription">{course.description}</p>
                <button >Записаться</button>
            </div>
            ))}
        </div>
     );
}
 
export default MyCourses;