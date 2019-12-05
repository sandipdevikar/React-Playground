import React, {PureComponent} from 'react';





class PDFG extends PureComponent{
    constructor(props){
      super(props);
      this.state ={
          noOfLateral:25,
          length:100,
          width:30
      }
      
    }


    jsPdfGenerator(){
      console.log(this.state.length);

      var doc = new jsPDF('p','pt');
      doc.text(20,20,`length = ${this.state.length}`)
      doc.text(20,40,`width = ${this.state.width}`)
      doc.setFont('courier')
   doc.save('generator.pdf');
    }
  render(){
   const {length,width} = this.state;
    return(
    
      <> 
      <button onClick={this.jsPdfGenerator.bind(this)}>Generate pdf</button></>
    )
  }

}

export default PDFG;