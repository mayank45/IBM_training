import { TestBed } from '@angular/core/testing';

import { UserService } from './user.service';

describe('UserService', () => {
  let service: UserService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      // providers: [UserService]
    });
    service = TestBed.inject(UserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });

  describe(", here", function(){
    it("user should get loggedIn", ()=>{
      // const service = TestBed.inject(UserService);
      expect(service.login).toBeFalsy();
      service.login=true;
      expect(service.login).toBeTruthy();
    })
  })
});
