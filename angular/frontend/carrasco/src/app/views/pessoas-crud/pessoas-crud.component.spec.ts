import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PessoasCrudComponent } from './pessoas-crud.component';

describe('PessoasCrudComponent', () => {
  let component: PessoasCrudComponent;
  let fixture: ComponentFixture<PessoasCrudComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PessoasCrudComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PessoasCrudComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
