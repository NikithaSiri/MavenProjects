import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DemoNgClassComponent } from './demo-ng-class.component';

describe('DemoNgClassComponent', () => {
  let component: DemoNgClassComponent;
  let fixture: ComponentFixture<DemoNgClassComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DemoNgClassComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DemoNgClassComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
