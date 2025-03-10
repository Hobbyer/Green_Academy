function test(){
  const ul_tag = document.querySelector('.my-ul');

  let data="";
  for (let i=0; i < 1000; i++) {
    data += `<li>${i}</li>`;
  }
  ul_tag.innerHTML = data;
}