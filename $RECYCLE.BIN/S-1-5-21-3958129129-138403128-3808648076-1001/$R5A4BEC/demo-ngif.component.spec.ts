import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DemoNgifComponent } from './demo-ngif.component';

describe('DemoNgifComponent', () => {
  let component: DemoNgifComponent;
  let fixture: ComponentFixture<DemoNgifComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DemoNgifComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DemoNgifComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
