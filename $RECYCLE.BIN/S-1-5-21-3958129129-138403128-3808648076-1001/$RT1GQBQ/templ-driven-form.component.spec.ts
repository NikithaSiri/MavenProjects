import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TemplDrivenFormComponent } from './templ-driven-form.component';

describe('TemplDrivenFormComponent', () => {
  let component: TemplDrivenFormComponent;
  let fixture: ComponentFixture<TemplDrivenFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TemplDrivenFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TemplDrivenFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
