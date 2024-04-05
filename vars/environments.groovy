pipeline{
    environment {
        Fname = "ram"
        Lname = "pavan"
        Mname = "nagaraj"
    }
agent any 
stages{
    stage("calling vars"){
        steps{
            sh "echo hello ${Fname} ${Lname}"
        }
    }
    stage("making change in1st"){
        steps{
            sh "echo hi devaraj"
        }
    }
    stage("adding new enivronment vars"){
    environment {
        Fname = "shiva"
        Mname = "nandi"
    }
    steps{
       sh "echo hello ${Fname} ${Mname}" 
    }
    }
    stage("adding third envi"){
    environment {
        Mname = "devraj"
    }
    steps{
        sh "echo ${Mname} ${Lname} ${Fname}"
        sh "echo hi hello tata good bye"
    }
    }
}
}
