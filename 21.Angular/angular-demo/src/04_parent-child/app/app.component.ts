import { Component, OnInit } from '@angular/core';
import { Person } from './../model/Person';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  people:Person[] = [
    {"name":"Bo Furst","address":"China","age":70,"email":"bfurst0@techcrunch.com","gender":"Female"},
  {"name":"Zachery Berkely","address":"Brazil","age":39,"email":"zberkely1@icq.com","gender":"Male"},
  {"name":"Daryl Karet","address":"Portugal","age":56,"email":"dkaret2@aboutads.info","gender":"Female"},
  {"name":"Julianna Grinley","address":"Indonesia","age":42,"email":"jgrinley3@cornell.edu","gender":"Female"},
  {"name":"Elonore Pirozzi","address":"Ukraine","age":6,"email":"epirozzi4@kickstarter.com","gender":"Female"},
  {"name":"Kelsey Mac Geaney","address":"Poland","age":56,"email":"kmac5@dion.ne.jp","gender":"Male"},
  {"name":"Warner Ellor","address":"China","age":47,"email":"wellor6@cornell.edu","gender":"Male"},
  {"name":"Maren Ovesen","address":"China","age":58,"email":"movesen7@house.gov","gender":"Female"},
  {"name":"Kipp Flexman","address":"Philippines","age":17,"email":"kflexman8@pagesperso-orange.fr","gender":"Female"},
  {"name":"Ailee Machel","address":"Indonesia","age":35,"email":"amachel9@time.com","gender":"Female"},
  {"name":"Gerri Pesek","address":"Afghanistan","age":19,"email":"gpeseka@va.gov","gender":"Male"},
  {"name":"Robenia Jirsa","address":"Japan","age":25,"email":"rjirsab@ted.com","gender":"Female"},
  {"name":"Sid Derwin","address":"Philippines","age":60,"email":"sderwinc@google.ca","gender":"Male"},
  {"name":"Cloe Nowill","address":"China","age":44,"email":"cnowilld@cbslocal.com","gender":"Female"},
  {"name":"Nicky Realff","address":"Sri Lanka","age":14,"email":"nrealffe@va.gov","gender":"Male"},
  {"name":"Aurelia Saurat","address":"Netherlands","age":63,"email":"asauratf@newyorker.com","gender":"Male"},
  {"name":"Barbara Bishop","address":"Greece","age":68,"email":"bbishopg@army.mil","gender":"Male"},
  {"name":"Ambrosio Dimmock","address":"China","age":28,"email":"adimmockh@yellowbook.com","gender":"Male"},
  {"name":"Lil Pacey","address":"Czech Republic","age":61,"email":"lpaceyi@merriam-webster.com","gender":"Male"},
  {"name":"Galina Radin","address":"Madagascar","age":37,"email":"gradinj@miibeian.gov.cn","gender":"Male"},
  {"name":"Fawne Insley","address":"Brazil","age":45,"email":"finsleyk@prlog.org","gender":"Female"},
  {"name":"Parrnell Stiegars","address":"China","age":10,"email":"pstiegarsl@linkedin.com","gender":"Female"},
  {"name":"Patton Musson","address":"China","age":46,"email":"pmussonm@cpanel.net","gender":"Male"},
  {"name":"Maxy Dennehy","address":"Russia","age":38,"email":"mdennehyn@tinyurl.com","gender":"Male"},
  {"name":"Sandi Bruntje","address":"Philippines","age":6,"email":"sbruntjeo@va.gov","gender":"Male"},
  {"name":"Michaelina Buxsy","address":"China","age":67,"email":"mbuxsyp@imageshack.us","gender":"Female"},
  {"name":"Jerald Clohisey","address":"Indonesia","age":8,"email":"jclohiseyq@cafepress.com","gender":"Female"},
  {"name":"Garrett Gawthorpe","address":"China","age":42,"email":"ggawthorper@xinhuanet.com","gender":"Male"},
  {"name":"Nickey Barling","address":"Sweden","age":45,"email":"nbarlings@geocities.com","gender":"Female"},
  {"name":"Hale Ferri","address":"Philippines","age":24,"email":"hferrit@webeden.co.uk","gender":"Female"},
  {"name":"Juliann Munro","address":"Colombia","age":47,"email":"jmunrou@constantcontact.com","gender":"Male"},
  {"name":"Sheffield Bleiman","address":"Philippines","age":13,"email":"sbleimanv@independent.co.uk","gender":"Female"},
  {"name":"Fania Raikes","address":"Serbia","age":20,"email":"fraikesw@google.ru","gender":"Female"},
  {"name":"Pauline Skyrme","address":"China","age":21,"email":"pskyrmex@discuz.net","gender":"Male"},
  {"name":"Brian Petren","address":"Nigeria","age":29,"email":"bpetreny@oracle.com","gender":"Female"},
  {"name":"Blake Baynon","address":"Indonesia","age":65,"email":"bbaynonz@imageshack.us","gender":"Male"},
  {"name":"Lurette Wilshin","address":"China","age":48,"email":"lwilshin10@cnet.com","gender":"Female"},
  {"name":"Bogart Hallsworth","address":"Indonesia","age":21,"email":"bhallsworth11@furl.net","gender":"Male"},
  {"name":"Gianna Furmedge","address":"Indonesia","age":27,"email":"gfurmedge12@t.co","gender":"Female"},
  {"name":"Thorn Diloway","address":"Portugal","age":10,"email":"tdiloway13@cloudflare.com","gender":"Female"},
  {"name":"Margit Squibbes","address":"Luxembourg","age":5,"email":"msquibbes14@ihg.com","gender":"Male"},
  {"name":"Philippe Stredwick","address":"Croatia","age":35,"email":"pstredwick15@patch.com","gender":"Female"},
  {"name":"Mab Ceney","address":"Japan","age":35,"email":"mceney16@seattletimes.com","gender":"Female"},
  {"name":"Cathryn Standrin","address":"United States","age":5,"email":"cstandrin17@digg.com","gender":"Male"},
  {"name":"Truman MacAindreis","address":"China","age":11,"email":"tmacaindreis18@nps.gov","gender":"Female"},
  {"name":"Maurie Lidgard","address":"Russia","age":40,"email":"mlidgard19@nature.com","gender":"Male"},
  {"name":"Reyna Foord","address":"South Africa","age":22,"email":"rfoord1a@gnu.org","gender":"Male"},
  {"name":"Taddeusz Lafayette","address":"Reunion","age":65,"email":"tlafayette1b@slashdot.org","gender":"Male"},
  {"name":"Renelle Lots","address":"Philippines","age":22,"email":"rlots1c@123-reg.co.uk","gender":"Male"},
  {"name":"Bald Bever","address":"Peru","age":15,"email":"bbever1d@vkontakte.ru","gender":"Female"},
  {"name":"Edouard Bockmann","address":"Philippines","age":50,"email":"ebockmann1e@sakura.ne.jp","gender":"Male"},
  {"name":"Tiphanie MacTerlagh","address":"China","age":42,"email":"tmacterlagh1f@cafepress.com","gender":"Male"},
  {"name":"Indira Melmar","address":"Malaysia","age":34,"email":"imelmar1g@vistaprint.com","gender":"Male"},
  {"name":"Karola Crabbe","address":"Botswana","age":69,"email":"kcrabbe1h@dmoz.org","gender":"Female"},
  {"name":"Kevyn Baudassi","address":"Indonesia","age":47,"email":"kbaudassi1i@tripadvisor.com","gender":"Male"},
  {"name":"Joe Duff","address":"Italy","age":6,"email":"jduff1j@marriott.com","gender":"Male"},
  {"name":"Myriam Wrefford","address":"Kazakhstan","age":41,"email":"mwrefford1k@ehow.com","gender":"Male"},
  {"name":"Laryssa Haycock","address":"Netherlands","age":68,"email":"lhaycock1l@ebay.co.uk","gender":"Male"},
  {"name":"Costanza Yielding","address":"Honduras","age":32,"email":"cyielding1m@army.mil","gender":"Female"},
  {"name":"Reg Hould","address":"Indonesia","age":33,"email":"rhould1n@webmd.com","gender":"Female"},
  {"name":"Abie Bloomer","address":"China","age":43,"email":"abloomer1o@i2i.jp","gender":"Male"},
  {"name":"Irma Winchcum","address":"Albania","age":54,"email":"iwinchcum1p@google.com.hk","gender":"Female"},
  {"name":"Joseito Schuh","address":"Spain","age":25,"email":"jschuh1q@tuttocitta.it","gender":"Male"},
  {"name":"Laughton Croshaw","address":"Colombia","age":19,"email":"lcroshaw1r@ezinearticles.com","gender":"Female"},
  {"name":"Garold Oldman","address":"Ukraine","age":28,"email":"goldman1s@cbc.ca","gender":"Male"},
  {"name":"Turner Moff","address":"Greece","age":36,"email":"tmoff1t@miibeian.gov.cn","gender":"Female"},
  {"name":"Juliette Gynni","address":"Ukraine","age":21,"email":"jgynni1u@deliciousdays.com","gender":"Male"},
  {"name":"Jan Kittow","address":"China","age":7,"email":"jkittow1v@parallels.com","gender":"Female"},
  {"name":"Stormi Dyton","address":"Russia","age":19,"email":"sdyton1w@hud.gov","gender":"Male"},
  {"name":"Jedd Waslin","address":"Thailand","age":17,"email":"jwaslin1x@acquirethisname.com","gender":"Male"},
  {"name":"Kiersten Roughsedge","address":"Grenada","age":67,"email":"kroughsedge1y@netvibes.com","gender":"Female"},
  {"name":"Jessie Croutear","address":"Greece","age":69,"email":"jcroutear1z@paginegialle.it","gender":"Male"},
  {"name":"Alonzo Badsey","address":"Mongolia","age":59,"email":"abadsey20@ed.gov","gender":"Female"},
  {"name":"Floria Hampshire","address":"Czech Republic","age":14,"email":"fhampshire21@spiegel.de","gender":"Female"},
  {"name":"Gilburt Lockyer","address":"Russia","age":60,"email":"glockyer22@tripadvisor.com","gender":"Female"},
  {"name":"Eilis Lermit","address":"Portugal","age":5,"email":"elermit23@google.it","gender":"Male"},
  {"name":"Linea Warret","address":"Vietnam","age":24,"email":"lwarret24@mozilla.com","gender":"Female"},
  {"name":"Sheelagh Deporte","address":"Indonesia","age":67,"email":"sdeporte25@amazon.de","gender":"Female"},
  {"name":"Markos Massow","address":"Tunisia","age":12,"email":"mmassow26@cornell.edu","gender":"Female"},
  {"name":"Rocky Worts","address":"Bulgaria","age":19,"email":"rworts27@alibaba.com","gender":"Male"},
  {"name":"Edvard Cleal","address":"China","age":42,"email":"ecleal28@icio.us","gender":"Male"},
  {"name":"Eddi Huke","address":"Philippines","age":50,"email":"ehuke29@stanford.edu","gender":"Male"},
  {"name":"Siward Mycock","address":"Colombia","age":61,"email":"smycock2a@google.com.br","gender":"Male"},
  {"name":"Darell Blain","address":"Bulgaria","age":5,"email":"dblain2b@addtoany.com","gender":"Female"},
  {"name":"Petr Crowcroft","address":"Somalia","age":23,"email":"pcrowcroft2c@nhs.uk","gender":"Female"},
  {"name":"Bartholemy O' Flaherty","address":"Argentina","age":50,"email":"bo2d@google.com.br","gender":"Female"},
  {"name":"Bartlett Woollacott","address":"Libya","age":22,"email":"bwoollacott2e@dyndns.org","gender":"Female"},
  {"name":"Amargo Mapes","address":"Costa Rica","age":39,"email":"amapes2f@moonfruit.com","gender":"Male"},
  {"name":"Milt Mulloch","address":"Brazil","age":56,"email":"mmulloch2g@trellian.com","gender":"Male"},
  {"name":"Alia Glanton","address":"Czech Republic","age":25,"email":"aglanton2h@yelp.com","gender":"Female"},
  {"name":"Courtney Nornable","address":"Norway","age":62,"email":"cnornable2i@fda.gov","gender":"Male"},
  {"name":"Dimitri Dawltrey","address":"Sweden","age":56,"email":"ddawltrey2j@cocolog-nifty.com","gender":"Female"},
  {"name":"Brocky Worpole","address":"China","age":50,"email":"bworpole2k@ocn.ne.jp","gender":"Female"},
  {"name":"Sawyer Mattussevich","address":"Mexico","age":19,"email":"smattussevich2l@tuttocitta.it","gender":"Male"},
  {"name":"Sarine Stanway","address":"Philippines","age":43,"email":"sstanway2m@amazon.com","gender":"Female"},
  {"name":"Paco De Gowe","address":"China","age":25,"email":"pde2n@infoseek.co.jp","gender":"Male"},
  {"name":"Humberto Cicetti","address":"Philippines","age":58,"email":"hcicetti2o@youtu.be","gender":"Male"},
  {"name":"Josi Spurrier","address":"China","age":14,"email":"jspurrier2p@phoca.cz","gender":"Male"},
  {"name":"Fletcher Craig","address":"Canada","age":11,"email":"fcraig2q@usatoday.com","gender":"Male"},
  {"name":"Isabeau Redmayne","address":"Greece","age":53,"email":"iredmayne2r@google.co.jp","gender":"Female"}]

  males:Person[] = [];
  females:Person[] = [];
  children:Person[] = [];
  constructor() { 
    this.males = this.people.filter((person)=>{
      if(person.gender=="Male"){
        return true;
      } else {
        return false;
      }
    });
    
    this.females = this.people.filter(person=>person.gender=="Female");
    this.children = this.people.filter(person=>person.age<18);
    
  }

  ngOnInit(): void {
  }

}
