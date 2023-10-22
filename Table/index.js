const report = document.getElementById("report");
async function fetchingCourse() {
  await axios.get("http://localhost:8080/module/get-modules").then((res) => {
    // console.log(res.data);
    const courses = res.data;
    fetchingEmployee(courses);
  });
}

async function fetchingEmployee(courses) {
  await axios
    .get("http://localhost:8080/employee/get-employees")
    .then((res) => {
      // console.log(res.data);
      const employees = res.data;
      render(courses, employees);
    });
}

async function render(courses, employees) {
  
  courses.forEach((course, i) => {
    report.innerHTML += `  <div class="row">
    <div class="col-md-6">
      <div class="card">
        <div class="card-header">Course Information</div>
        <div class="card-body">
          <h5 class="card-title">Course Name: ${course.name}</h5>
          <p class="card-text">
            Description: ${course.description}.
          </p>
        </div>
      </div>
    </div>
  </div>
  <div class="row mt-4">
    <div class="col-md-12">
        <div class="card">
        <div class="card-header">Employee Progress</div>
        <div class="card-body">
            <table class="table">
            <thead>
                <tr>
                <th scope="col">#</th>
                <th scope="col">Employee Name</th>
                <th scope="col">Progress</th>
                </tr>
            </thead>
            <tbody id="${course.name}" >
                
            </tbody>
            </table>
        </div>
        </div>
    </div>
 </div>
 <br>
`;

    let row = 1;
    const data = document.getElementById(course.name);
    // for (let i = 0; i < employees.length; i++) {
    //   if (employees[i].trainingModule.name == course.name) {
    //     data.innerHTML += `<tr>
    // <th>${row}</th>
    // <td>${employees[i].name}</td>
    // <td>${employees[i].progress}</td>
    // </tr>`;
    //     row++;
    //   }
    // }
   
   employees.forEach((employee)=>{
    if(course.name == employee.trainingModule.name){
    data.innerHTML += `<tr>
     <th>${row}</th>
     <td>${employee.name}</td>
     <td>${employee.progress}</td>
     </tr>`;
     row++
    }
   })
    })
}

fetchingCourse();
