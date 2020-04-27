package bvoc.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({bvoc.test.EventIT.class, bvoc.test.FieldIT.class, bvoc.test.ProfileIT.class, bvoc.test.HistoryIT.class, bvoc.test.MessageIT.class, bvoc.test.GroupMessageIT.class, bvoc.test.GroupIT.class})
public class TestITSuite 
{
}
