package uk.ac.kcl.inf.mdd.project.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.mdd.project.services.GithubactionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGithubactionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Repository'", "'{'", "'workflows'", "','", "'}'", "'Workflow'", "'name'", "'on'", "'env'", "'defaults'", "'jobs'", "'Job'", "'needs'", "'('", "')'", "'runsOn'", "'environment'", "'outputs'", "'if'", "'steps'", "'Step'", "'uses'", "'run'", "'runSetting'", "'with'", "'entrypoint'", "'args'", "':'", "'RunSetting'", "'workingDirectory'", "'shell'", "'PushEvent'", "'branches'", "'tags'", "'branchesIgnore'", "'tagsIgnore'", "'paths'", "'pathsIgnore'", "'PullRequestEvent'", "'ScheduleEvent'", "'minute'", "'hour'", "'day'", "'month'", "'dayOfWeek'", "'WorkflowDispatchEvent'", "'inputs'", "'RepositoryDispatchEvent'", "'eventTypes'", "'CreateEvent'", "'DeleteEvent'", "'DeploymentEvent'", "'IssueEvent'", "'activityTypes'", "'LabelEvent'", "'required'", "'Input'", "'description'", "'default'", "'opened'", "'edited'", "'deleted'", "'transferred'", "'pinned'", "'unpinned'", "'closed'", "'reopened'", "'assigned'", "'unassigned'", "'labeled'", "'unlabeled'", "'locked'", "'unlocked'", "'milestoned'", "'demilestoned'", "'created'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalGithubactionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGithubactionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGithubactionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGithubaction.g"; }



     	private GithubactionGrammarAccess grammarAccess;

        public InternalGithubactionParser(TokenStream input, GithubactionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Repository";
       	}

       	@Override
       	protected GithubactionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRepository"
    // InternalGithubaction.g:65:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalGithubaction.g:65:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalGithubaction.g:66:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalGithubaction.g:72:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'workflows' otherlv_4= '{' ( (lv_workflows_5_0= ruleWorkflow ) ) (otherlv_6= ',' ( (lv_workflows_7_0= ruleWorkflow ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_workflows_5_0 = null;

        EObject lv_workflows_7_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:78:2: ( ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'workflows' otherlv_4= '{' ( (lv_workflows_5_0= ruleWorkflow ) ) (otherlv_6= ',' ( (lv_workflows_7_0= ruleWorkflow ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalGithubaction.g:79:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'workflows' otherlv_4= '{' ( (lv_workflows_5_0= ruleWorkflow ) ) (otherlv_6= ',' ( (lv_workflows_7_0= ruleWorkflow ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalGithubaction.g:79:2: ( () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'workflows' otherlv_4= '{' ( (lv_workflows_5_0= ruleWorkflow ) ) (otherlv_6= ',' ( (lv_workflows_7_0= ruleWorkflow ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalGithubaction.g:80:3: () otherlv_1= 'Repository' otherlv_2= '{' (otherlv_3= 'workflows' otherlv_4= '{' ( (lv_workflows_5_0= ruleWorkflow ) ) (otherlv_6= ',' ( (lv_workflows_7_0= ruleWorkflow ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalGithubaction.g:80:3: ()
            // InternalGithubaction.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGithubaction.g:95:3: (otherlv_3= 'workflows' otherlv_4= '{' ( (lv_workflows_5_0= ruleWorkflow ) ) (otherlv_6= ',' ( (lv_workflows_7_0= ruleWorkflow ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGithubaction.g:96:4: otherlv_3= 'workflows' otherlv_4= '{' ( (lv_workflows_5_0= ruleWorkflow ) ) (otherlv_6= ',' ( (lv_workflows_7_0= ruleWorkflow ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getWorkflowsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalGithubaction.g:104:4: ( (lv_workflows_5_0= ruleWorkflow ) )
                    // InternalGithubaction.g:105:5: (lv_workflows_5_0= ruleWorkflow )
                    {
                    // InternalGithubaction.g:105:5: (lv_workflows_5_0= ruleWorkflow )
                    // InternalGithubaction.g:106:6: lv_workflows_5_0= ruleWorkflow
                    {

                    						newCompositeNode(grammarAccess.getRepositoryAccess().getWorkflowsWorkflowParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_workflows_5_0=ruleWorkflow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    						}
                    						add(
                    							current,
                    							"workflows",
                    							lv_workflows_5_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.Workflow");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:123:4: (otherlv_6= ',' ( (lv_workflows_7_0= ruleWorkflow ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalGithubaction.g:124:5: otherlv_6= ',' ( (lv_workflows_7_0= ruleWorkflow ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalGithubaction.g:128:5: ( (lv_workflows_7_0= ruleWorkflow ) )
                    	    // InternalGithubaction.g:129:6: (lv_workflows_7_0= ruleWorkflow )
                    	    {
                    	    // InternalGithubaction.g:129:6: (lv_workflows_7_0= ruleWorkflow )
                    	    // InternalGithubaction.g:130:7: lv_workflows_7_0= ruleWorkflow
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryAccess().getWorkflowsWorkflowParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_workflows_7_0=ruleWorkflow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"workflows",
                    	    								lv_workflows_7_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.Workflow");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleWorkflow"
    // InternalGithubaction.g:161:1: entryRuleWorkflow returns [EObject current=null] : iv_ruleWorkflow= ruleWorkflow EOF ;
    public final EObject entryRuleWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow = null;


        try {
            // InternalGithubaction.g:161:49: (iv_ruleWorkflow= ruleWorkflow EOF )
            // InternalGithubaction.g:162:2: iv_ruleWorkflow= ruleWorkflow EOF
            {
             newCompositeNode(grammarAccess.getWorkflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflow=ruleWorkflow();

            state._fsp--;

             current =iv_ruleWorkflow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflow"


    // $ANTLR start "ruleWorkflow"
    // InternalGithubaction.g:168:1: ruleWorkflow returns [EObject current=null] : ( () otherlv_1= 'Workflow' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'on' otherlv_6= '{' ( (lv_on_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_on_9_0= ruleEvent ) ) )* otherlv_10= '}' )? (otherlv_11= 'env' otherlv_12= '{' ( (lv_env_13_0= ruleEnv ) ) (otherlv_14= ',' ( (lv_env_15_0= ruleEnv ) ) )* otherlv_16= '}' )? (otherlv_17= 'defaults' ( (lv_defaults_18_0= ruleRunSetting ) ) )? (otherlv_19= 'jobs' otherlv_20= '{' ( (lv_jobs_21_0= ruleJob ) ) (otherlv_22= ',' ( (lv_jobs_23_0= ruleJob ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_on_7_0 = null;

        EObject lv_on_9_0 = null;

        EObject lv_env_13_0 = null;

        EObject lv_env_15_0 = null;

        EObject lv_defaults_18_0 = null;

        EObject lv_jobs_21_0 = null;

        EObject lv_jobs_23_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:174:2: ( ( () otherlv_1= 'Workflow' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'on' otherlv_6= '{' ( (lv_on_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_on_9_0= ruleEvent ) ) )* otherlv_10= '}' )? (otherlv_11= 'env' otherlv_12= '{' ( (lv_env_13_0= ruleEnv ) ) (otherlv_14= ',' ( (lv_env_15_0= ruleEnv ) ) )* otherlv_16= '}' )? (otherlv_17= 'defaults' ( (lv_defaults_18_0= ruleRunSetting ) ) )? (otherlv_19= 'jobs' otherlv_20= '{' ( (lv_jobs_21_0= ruleJob ) ) (otherlv_22= ',' ( (lv_jobs_23_0= ruleJob ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // InternalGithubaction.g:175:2: ( () otherlv_1= 'Workflow' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'on' otherlv_6= '{' ( (lv_on_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_on_9_0= ruleEvent ) ) )* otherlv_10= '}' )? (otherlv_11= 'env' otherlv_12= '{' ( (lv_env_13_0= ruleEnv ) ) (otherlv_14= ',' ( (lv_env_15_0= ruleEnv ) ) )* otherlv_16= '}' )? (otherlv_17= 'defaults' ( (lv_defaults_18_0= ruleRunSetting ) ) )? (otherlv_19= 'jobs' otherlv_20= '{' ( (lv_jobs_21_0= ruleJob ) ) (otherlv_22= ',' ( (lv_jobs_23_0= ruleJob ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // InternalGithubaction.g:175:2: ( () otherlv_1= 'Workflow' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'on' otherlv_6= '{' ( (lv_on_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_on_9_0= ruleEvent ) ) )* otherlv_10= '}' )? (otherlv_11= 'env' otherlv_12= '{' ( (lv_env_13_0= ruleEnv ) ) (otherlv_14= ',' ( (lv_env_15_0= ruleEnv ) ) )* otherlv_16= '}' )? (otherlv_17= 'defaults' ( (lv_defaults_18_0= ruleRunSetting ) ) )? (otherlv_19= 'jobs' otherlv_20= '{' ( (lv_jobs_21_0= ruleJob ) ) (otherlv_22= ',' ( (lv_jobs_23_0= ruleJob ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // InternalGithubaction.g:176:3: () otherlv_1= 'Workflow' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )? (otherlv_5= 'on' otherlv_6= '{' ( (lv_on_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_on_9_0= ruleEvent ) ) )* otherlv_10= '}' )? (otherlv_11= 'env' otherlv_12= '{' ( (lv_env_13_0= ruleEnv ) ) (otherlv_14= ',' ( (lv_env_15_0= ruleEnv ) ) )* otherlv_16= '}' )? (otherlv_17= 'defaults' ( (lv_defaults_18_0= ruleRunSetting ) ) )? (otherlv_19= 'jobs' otherlv_20= '{' ( (lv_jobs_21_0= ruleJob ) ) (otherlv_22= ',' ( (lv_jobs_23_0= ruleJob ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            // InternalGithubaction.g:176:3: ()
            // InternalGithubaction.g:177:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkflowAccess().getWorkflowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkflowAccess().getWorkflowKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGithubaction.g:191:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGithubaction.g:192:4: otherlv_3= 'name' ( (lv_name_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getWorkflowAccess().getNameKeyword_3_0());
                    			
                    // InternalGithubaction.g:196:4: ( (lv_name_4_0= ruleEString ) )
                    // InternalGithubaction.g:197:5: (lv_name_4_0= ruleEString )
                    {
                    // InternalGithubaction.g:197:5: (lv_name_4_0= ruleEString )
                    // InternalGithubaction.g:198:6: lv_name_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getWorkflowAccess().getNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_name_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:216:3: (otherlv_5= 'on' otherlv_6= '{' ( (lv_on_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_on_9_0= ruleEvent ) ) )* otherlv_10= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalGithubaction.g:217:4: otherlv_5= 'on' otherlv_6= '{' ( (lv_on_7_0= ruleEvent ) ) (otherlv_8= ',' ( (lv_on_9_0= ruleEvent ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getWorkflowAccess().getOnKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalGithubaction.g:225:4: ( (lv_on_7_0= ruleEvent ) )
                    // InternalGithubaction.g:226:5: (lv_on_7_0= ruleEvent )
                    {
                    // InternalGithubaction.g:226:5: (lv_on_7_0= ruleEvent )
                    // InternalGithubaction.g:227:6: lv_on_7_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getWorkflowAccess().getOnEventParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_on_7_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    						}
                    						add(
                    							current,
                    							"on",
                    							lv_on_7_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:244:4: (otherlv_8= ',' ( (lv_on_9_0= ruleEvent ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalGithubaction.g:245:5: otherlv_8= ',' ( (lv_on_9_0= ruleEvent ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getWorkflowAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGithubaction.g:249:5: ( (lv_on_9_0= ruleEvent ) )
                    	    // InternalGithubaction.g:250:6: (lv_on_9_0= ruleEvent )
                    	    {
                    	    // InternalGithubaction.g:250:6: (lv_on_9_0= ruleEvent )
                    	    // InternalGithubaction.g:251:7: lv_on_9_0= ruleEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkflowAccess().getOnEventParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_on_9_0=ruleEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"on",
                    	    								lv_on_9_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.Event");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:274:3: (otherlv_11= 'env' otherlv_12= '{' ( (lv_env_13_0= ruleEnv ) ) (otherlv_14= ',' ( (lv_env_15_0= ruleEnv ) ) )* otherlv_16= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGithubaction.g:275:4: otherlv_11= 'env' otherlv_12= '{' ( (lv_env_13_0= ruleEnv ) ) (otherlv_14= ',' ( (lv_env_15_0= ruleEnv ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getWorkflowAccess().getEnvKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_12, grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGithubaction.g:283:4: ( (lv_env_13_0= ruleEnv ) )
                    // InternalGithubaction.g:284:5: (lv_env_13_0= ruleEnv )
                    {
                    // InternalGithubaction.g:284:5: (lv_env_13_0= ruleEnv )
                    // InternalGithubaction.g:285:6: lv_env_13_0= ruleEnv
                    {

                    						newCompositeNode(grammarAccess.getWorkflowAccess().getEnvEnvParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_env_13_0=ruleEnv();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    						}
                    						add(
                    							current,
                    							"env",
                    							lv_env_13_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.Env");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:302:4: (otherlv_14= ',' ( (lv_env_15_0= ruleEnv ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalGithubaction.g:303:5: otherlv_14= ',' ( (lv_env_15_0= ruleEnv ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getWorkflowAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGithubaction.g:307:5: ( (lv_env_15_0= ruleEnv ) )
                    	    // InternalGithubaction.g:308:6: (lv_env_15_0= ruleEnv )
                    	    {
                    	    // InternalGithubaction.g:308:6: (lv_env_15_0= ruleEnv )
                    	    // InternalGithubaction.g:309:7: lv_env_15_0= ruleEnv
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkflowAccess().getEnvEnvParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_env_15_0=ruleEnv();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"env",
                    	    								lv_env_15_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.Env");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:332:3: (otherlv_17= 'defaults' ( (lv_defaults_18_0= ruleRunSetting ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGithubaction.g:333:4: otherlv_17= 'defaults' ( (lv_defaults_18_0= ruleRunSetting ) )
                    {
                    otherlv_17=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getWorkflowAccess().getDefaultsKeyword_6_0());
                    			
                    // InternalGithubaction.g:337:4: ( (lv_defaults_18_0= ruleRunSetting ) )
                    // InternalGithubaction.g:338:5: (lv_defaults_18_0= ruleRunSetting )
                    {
                    // InternalGithubaction.g:338:5: (lv_defaults_18_0= ruleRunSetting )
                    // InternalGithubaction.g:339:6: lv_defaults_18_0= ruleRunSetting
                    {

                    						newCompositeNode(grammarAccess.getWorkflowAccess().getDefaultsRunSettingParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_defaults_18_0=ruleRunSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    						}
                    						set(
                    							current,
                    							"defaults",
                    							lv_defaults_18_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.RunSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:357:3: (otherlv_19= 'jobs' otherlv_20= '{' ( (lv_jobs_21_0= ruleJob ) ) (otherlv_22= ',' ( (lv_jobs_23_0= ruleJob ) ) )* otherlv_24= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalGithubaction.g:358:4: otherlv_19= 'jobs' otherlv_20= '{' ( (lv_jobs_21_0= ruleJob ) ) (otherlv_22= ',' ( (lv_jobs_23_0= ruleJob ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getWorkflowAccess().getJobsKeyword_7_0());
                    			
                    otherlv_20=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_20, grammarAccess.getWorkflowAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalGithubaction.g:366:4: ( (lv_jobs_21_0= ruleJob ) )
                    // InternalGithubaction.g:367:5: (lv_jobs_21_0= ruleJob )
                    {
                    // InternalGithubaction.g:367:5: (lv_jobs_21_0= ruleJob )
                    // InternalGithubaction.g:368:6: lv_jobs_21_0= ruleJob
                    {

                    						newCompositeNode(grammarAccess.getWorkflowAccess().getJobsJobParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_jobs_21_0=ruleJob();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    						}
                    						add(
                    							current,
                    							"jobs",
                    							lv_jobs_21_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.Job");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:385:4: (otherlv_22= ',' ( (lv_jobs_23_0= ruleJob ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalGithubaction.g:386:5: otherlv_22= ',' ( (lv_jobs_23_0= ruleJob ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getWorkflowAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalGithubaction.g:390:5: ( (lv_jobs_23_0= ruleJob ) )
                    	    // InternalGithubaction.g:391:6: (lv_jobs_23_0= ruleJob )
                    	    {
                    	    // InternalGithubaction.g:391:6: (lv_jobs_23_0= ruleJob )
                    	    // InternalGithubaction.g:392:7: lv_jobs_23_0= ruleJob
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkflowAccess().getJobsJobParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_jobs_23_0=ruleJob();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkflowRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"jobs",
                    	    								lv_jobs_23_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.Job");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_24, grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getWorkflowAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflow"


    // $ANTLR start "entryRuleEvent"
    // InternalGithubaction.g:423:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalGithubaction.g:423:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalGithubaction.g:424:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalGithubaction.g:430:1: ruleEvent returns [EObject current=null] : (this_PushEvent_0= rulePushEvent | this_PullRequestEvent_1= rulePullRequestEvent | this_ScheduleEvent_2= ruleScheduleEvent | this_WorkflowDispatchEvent_3= ruleWorkflowDispatchEvent | this_RepositoryDispatchEvent_4= ruleRepositoryDispatchEvent | this_CreateEvent_5= ruleCreateEvent | this_DeleteEvent_6= ruleDeleteEvent | this_DeploymentEvent_7= ruleDeploymentEvent | this_IssueEvent_8= ruleIssueEvent | this_LabelEvent_9= ruleLabelEvent ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_PushEvent_0 = null;

        EObject this_PullRequestEvent_1 = null;

        EObject this_ScheduleEvent_2 = null;

        EObject this_WorkflowDispatchEvent_3 = null;

        EObject this_RepositoryDispatchEvent_4 = null;

        EObject this_CreateEvent_5 = null;

        EObject this_DeleteEvent_6 = null;

        EObject this_DeploymentEvent_7 = null;

        EObject this_IssueEvent_8 = null;

        EObject this_LabelEvent_9 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:436:2: ( (this_PushEvent_0= rulePushEvent | this_PullRequestEvent_1= rulePullRequestEvent | this_ScheduleEvent_2= ruleScheduleEvent | this_WorkflowDispatchEvent_3= ruleWorkflowDispatchEvent | this_RepositoryDispatchEvent_4= ruleRepositoryDispatchEvent | this_CreateEvent_5= ruleCreateEvent | this_DeleteEvent_6= ruleDeleteEvent | this_DeploymentEvent_7= ruleDeploymentEvent | this_IssueEvent_8= ruleIssueEvent | this_LabelEvent_9= ruleLabelEvent ) )
            // InternalGithubaction.g:437:2: (this_PushEvent_0= rulePushEvent | this_PullRequestEvent_1= rulePullRequestEvent | this_ScheduleEvent_2= ruleScheduleEvent | this_WorkflowDispatchEvent_3= ruleWorkflowDispatchEvent | this_RepositoryDispatchEvent_4= ruleRepositoryDispatchEvent | this_CreateEvent_5= ruleCreateEvent | this_DeleteEvent_6= ruleDeleteEvent | this_DeploymentEvent_7= ruleDeploymentEvent | this_IssueEvent_8= ruleIssueEvent | this_LabelEvent_9= ruleLabelEvent )
            {
            // InternalGithubaction.g:437:2: (this_PushEvent_0= rulePushEvent | this_PullRequestEvent_1= rulePullRequestEvent | this_ScheduleEvent_2= ruleScheduleEvent | this_WorkflowDispatchEvent_3= ruleWorkflowDispatchEvent | this_RepositoryDispatchEvent_4= ruleRepositoryDispatchEvent | this_CreateEvent_5= ruleCreateEvent | this_DeleteEvent_6= ruleDeleteEvent | this_DeploymentEvent_7= ruleDeploymentEvent | this_IssueEvent_8= ruleIssueEvent | this_LabelEvent_9= ruleLabelEvent )
            int alt11=10;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt11=1;
                }
                break;
            case 49:
                {
                alt11=2;
                }
                break;
            case 50:
                {
                alt11=3;
                }
                break;
            case 56:
                {
                alt11=4;
                }
                break;
            case 58:
                {
                alt11=5;
                }
                break;
            case 60:
                {
                alt11=6;
                }
                break;
            case 61:
                {
                alt11=7;
                }
                break;
            case 62:
                {
                alt11=8;
                }
                break;
            case 63:
                {
                alt11=9;
                }
                break;
            case 65:
                {
                alt11=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalGithubaction.g:438:3: this_PushEvent_0= rulePushEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getPushEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PushEvent_0=rulePushEvent();

                    state._fsp--;


                    			current = this_PushEvent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalGithubaction.g:447:3: this_PullRequestEvent_1= rulePullRequestEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getPullRequestEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PullRequestEvent_1=rulePullRequestEvent();

                    state._fsp--;


                    			current = this_PullRequestEvent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalGithubaction.g:456:3: this_ScheduleEvent_2= ruleScheduleEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getScheduleEventParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScheduleEvent_2=ruleScheduleEvent();

                    state._fsp--;


                    			current = this_ScheduleEvent_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalGithubaction.g:465:3: this_WorkflowDispatchEvent_3= ruleWorkflowDispatchEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getWorkflowDispatchEventParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_WorkflowDispatchEvent_3=ruleWorkflowDispatchEvent();

                    state._fsp--;


                    			current = this_WorkflowDispatchEvent_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalGithubaction.g:474:3: this_RepositoryDispatchEvent_4= ruleRepositoryDispatchEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getRepositoryDispatchEventParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RepositoryDispatchEvent_4=ruleRepositoryDispatchEvent();

                    state._fsp--;


                    			current = this_RepositoryDispatchEvent_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalGithubaction.g:483:3: this_CreateEvent_5= ruleCreateEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getCreateEventParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreateEvent_5=ruleCreateEvent();

                    state._fsp--;


                    			current = this_CreateEvent_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalGithubaction.g:492:3: this_DeleteEvent_6= ruleDeleteEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getDeleteEventParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeleteEvent_6=ruleDeleteEvent();

                    state._fsp--;


                    			current = this_DeleteEvent_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalGithubaction.g:501:3: this_DeploymentEvent_7= ruleDeploymentEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getDeploymentEventParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeploymentEvent_7=ruleDeploymentEvent();

                    state._fsp--;


                    			current = this_DeploymentEvent_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalGithubaction.g:510:3: this_IssueEvent_8= ruleIssueEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getIssueEventParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_IssueEvent_8=ruleIssueEvent();

                    state._fsp--;


                    			current = this_IssueEvent_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalGithubaction.g:519:3: this_LabelEvent_9= ruleLabelEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getLabelEventParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_LabelEvent_9=ruleLabelEvent();

                    state._fsp--;


                    			current = this_LabelEvent_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleJob"
    // InternalGithubaction.g:531:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalGithubaction.g:531:44: (iv_ruleJob= ruleJob EOF )
            // InternalGithubaction.g:532:2: iv_ruleJob= ruleJob EOF
            {
             newCompositeNode(grammarAccess.getJobRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJob=ruleJob();

            state._fsp--;

             current =iv_ruleJob; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJob"


    // $ANTLR start "ruleJob"
    // InternalGithubaction.g:538:1: ruleJob returns [EObject current=null] : (otherlv_0= 'Job' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_jobName_4_0= ruleEString ) ) )? (otherlv_5= 'needs' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'runsOn' ( (lv_runsOn_12_0= ruleEString ) ) )? (otherlv_13= 'environment' ( ( ruleEString ) ) )? (otherlv_15= 'outputs' otherlv_16= '{' ( (lv_outputs_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_outputs_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'env' otherlv_22= '{' ( (lv_env_23_0= ruleEnv ) ) (otherlv_24= ',' ( (lv_env_25_0= ruleEnv ) ) )* otherlv_26= '}' )? (otherlv_27= 'defaults' otherlv_28= '{' ( (lv_defaults_29_0= ruleRunSetting ) ) (otherlv_30= ',' ( (lv_defaults_31_0= ruleRunSetting ) ) )* otherlv_32= '}' )? (otherlv_33= 'if' ( (lv_if_34_0= ruleEString ) ) )? (otherlv_35= 'steps' otherlv_36= '{' ( (lv_steps_37_0= ruleStep ) ) (otherlv_38= ',' ( (lv_steps_39_0= ruleStep ) ) )* otherlv_40= '}' )? otherlv_41= '}' ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        AntlrDatatypeRuleToken lv_jobName_4_0 = null;

        AntlrDatatypeRuleToken lv_runsOn_12_0 = null;

        AntlrDatatypeRuleToken lv_outputs_17_0 = null;

        AntlrDatatypeRuleToken lv_outputs_19_0 = null;

        EObject lv_env_23_0 = null;

        EObject lv_env_25_0 = null;

        EObject lv_defaults_29_0 = null;

        EObject lv_defaults_31_0 = null;

        AntlrDatatypeRuleToken lv_if_34_0 = null;

        EObject lv_steps_37_0 = null;

        EObject lv_steps_39_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:544:2: ( (otherlv_0= 'Job' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_jobName_4_0= ruleEString ) ) )? (otherlv_5= 'needs' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'runsOn' ( (lv_runsOn_12_0= ruleEString ) ) )? (otherlv_13= 'environment' ( ( ruleEString ) ) )? (otherlv_15= 'outputs' otherlv_16= '{' ( (lv_outputs_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_outputs_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'env' otherlv_22= '{' ( (lv_env_23_0= ruleEnv ) ) (otherlv_24= ',' ( (lv_env_25_0= ruleEnv ) ) )* otherlv_26= '}' )? (otherlv_27= 'defaults' otherlv_28= '{' ( (lv_defaults_29_0= ruleRunSetting ) ) (otherlv_30= ',' ( (lv_defaults_31_0= ruleRunSetting ) ) )* otherlv_32= '}' )? (otherlv_33= 'if' ( (lv_if_34_0= ruleEString ) ) )? (otherlv_35= 'steps' otherlv_36= '{' ( (lv_steps_37_0= ruleStep ) ) (otherlv_38= ',' ( (lv_steps_39_0= ruleStep ) ) )* otherlv_40= '}' )? otherlv_41= '}' ) )
            // InternalGithubaction.g:545:2: (otherlv_0= 'Job' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_jobName_4_0= ruleEString ) ) )? (otherlv_5= 'needs' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'runsOn' ( (lv_runsOn_12_0= ruleEString ) ) )? (otherlv_13= 'environment' ( ( ruleEString ) ) )? (otherlv_15= 'outputs' otherlv_16= '{' ( (lv_outputs_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_outputs_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'env' otherlv_22= '{' ( (lv_env_23_0= ruleEnv ) ) (otherlv_24= ',' ( (lv_env_25_0= ruleEnv ) ) )* otherlv_26= '}' )? (otherlv_27= 'defaults' otherlv_28= '{' ( (lv_defaults_29_0= ruleRunSetting ) ) (otherlv_30= ',' ( (lv_defaults_31_0= ruleRunSetting ) ) )* otherlv_32= '}' )? (otherlv_33= 'if' ( (lv_if_34_0= ruleEString ) ) )? (otherlv_35= 'steps' otherlv_36= '{' ( (lv_steps_37_0= ruleStep ) ) (otherlv_38= ',' ( (lv_steps_39_0= ruleStep ) ) )* otherlv_40= '}' )? otherlv_41= '}' )
            {
            // InternalGithubaction.g:545:2: (otherlv_0= 'Job' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_jobName_4_0= ruleEString ) ) )? (otherlv_5= 'needs' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'runsOn' ( (lv_runsOn_12_0= ruleEString ) ) )? (otherlv_13= 'environment' ( ( ruleEString ) ) )? (otherlv_15= 'outputs' otherlv_16= '{' ( (lv_outputs_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_outputs_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'env' otherlv_22= '{' ( (lv_env_23_0= ruleEnv ) ) (otherlv_24= ',' ( (lv_env_25_0= ruleEnv ) ) )* otherlv_26= '}' )? (otherlv_27= 'defaults' otherlv_28= '{' ( (lv_defaults_29_0= ruleRunSetting ) ) (otherlv_30= ',' ( (lv_defaults_31_0= ruleRunSetting ) ) )* otherlv_32= '}' )? (otherlv_33= 'if' ( (lv_if_34_0= ruleEString ) ) )? (otherlv_35= 'steps' otherlv_36= '{' ( (lv_steps_37_0= ruleStep ) ) (otherlv_38= ',' ( (lv_steps_39_0= ruleStep ) ) )* otherlv_40= '}' )? otherlv_41= '}' )
            // InternalGithubaction.g:546:3: otherlv_0= 'Job' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'name' ( (lv_jobName_4_0= ruleEString ) ) )? (otherlv_5= 'needs' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'runsOn' ( (lv_runsOn_12_0= ruleEString ) ) )? (otherlv_13= 'environment' ( ( ruleEString ) ) )? (otherlv_15= 'outputs' otherlv_16= '{' ( (lv_outputs_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_outputs_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'env' otherlv_22= '{' ( (lv_env_23_0= ruleEnv ) ) (otherlv_24= ',' ( (lv_env_25_0= ruleEnv ) ) )* otherlv_26= '}' )? (otherlv_27= 'defaults' otherlv_28= '{' ( (lv_defaults_29_0= ruleRunSetting ) ) (otherlv_30= ',' ( (lv_defaults_31_0= ruleRunSetting ) ) )* otherlv_32= '}' )? (otherlv_33= 'if' ( (lv_if_34_0= ruleEString ) ) )? (otherlv_35= 'steps' otherlv_36= '{' ( (lv_steps_37_0= ruleStep ) ) (otherlv_38= ',' ( (lv_steps_39_0= ruleStep ) ) )* otherlv_40= '}' )? otherlv_41= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getJobAccess().getJobKeyword_0());
            		
            // InternalGithubaction.g:550:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalGithubaction.g:551:4: (lv_name_1_0= RULE_ID )
            {
            // InternalGithubaction.g:551:4: (lv_name_1_0= RULE_ID )
            // InternalGithubaction.g:552:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(lv_name_1_0, grammarAccess.getJobAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJobRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGithubaction.g:572:3: (otherlv_3= 'name' ( (lv_jobName_4_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalGithubaction.g:573:4: otherlv_3= 'name' ( (lv_jobName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getJobAccess().getNameKeyword_3_0());
                    			
                    // InternalGithubaction.g:577:4: ( (lv_jobName_4_0= ruleEString ) )
                    // InternalGithubaction.g:578:5: (lv_jobName_4_0= ruleEString )
                    {
                    // InternalGithubaction.g:578:5: (lv_jobName_4_0= ruleEString )
                    // InternalGithubaction.g:579:6: lv_jobName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getJobNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_jobName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						set(
                    							current,
                    							"jobName",
                    							lv_jobName_4_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:597:3: (otherlv_5= 'needs' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalGithubaction.g:598:4: otherlv_5= 'needs' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getJobAccess().getNeedsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getJobAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalGithubaction.g:606:4: ( ( ruleEString ) )
                    // InternalGithubaction.g:607:5: ( ruleEString )
                    {
                    // InternalGithubaction.g:607:5: ( ruleEString )
                    // InternalGithubaction.g:608:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJobRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJobAccess().getNeedsJobCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_21);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:622:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalGithubaction.g:623:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getJobAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGithubaction.g:627:5: ( ( ruleEString ) )
                    	    // InternalGithubaction.g:628:6: ( ruleEString )
                    	    {
                    	    // InternalGithubaction.g:628:6: ( ruleEString )
                    	    // InternalGithubaction.g:629:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getJobRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getJobAccess().getNeedsJobCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_21);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getJobAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:649:3: (otherlv_11= 'runsOn' ( (lv_runsOn_12_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalGithubaction.g:650:4: otherlv_11= 'runsOn' ( (lv_runsOn_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getJobAccess().getRunsOnKeyword_5_0());
                    			
                    // InternalGithubaction.g:654:4: ( (lv_runsOn_12_0= ruleEString ) )
                    // InternalGithubaction.g:655:5: (lv_runsOn_12_0= ruleEString )
                    {
                    // InternalGithubaction.g:655:5: (lv_runsOn_12_0= ruleEString )
                    // InternalGithubaction.g:656:6: lv_runsOn_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getRunsOnEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_runsOn_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						set(
                    							current,
                    							"runsOn",
                    							lv_runsOn_12_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:674:3: (otherlv_13= 'environment' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalGithubaction.g:675:4: otherlv_13= 'environment' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,27,FOLLOW_9); 

                    				newLeafNode(otherlv_13, grammarAccess.getJobAccess().getEnvironmentKeyword_6_0());
                    			
                    // InternalGithubaction.g:679:4: ( ( ruleEString ) )
                    // InternalGithubaction.g:680:5: ( ruleEString )
                    {
                    // InternalGithubaction.g:680:5: ( ruleEString )
                    // InternalGithubaction.g:681:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJobRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getJobAccess().getEnvironmentEnvironmentCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:696:3: (otherlv_15= 'outputs' otherlv_16= '{' ( (lv_outputs_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_outputs_19_0= ruleEString ) ) )* otherlv_20= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalGithubaction.g:697:4: otherlv_15= 'outputs' otherlv_16= '{' ( (lv_outputs_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_outputs_19_0= ruleEString ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getJobAccess().getOutputsKeyword_7_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalGithubaction.g:705:4: ( (lv_outputs_17_0= ruleEString ) )
                    // InternalGithubaction.g:706:5: (lv_outputs_17_0= ruleEString )
                    {
                    // InternalGithubaction.g:706:5: (lv_outputs_17_0= ruleEString )
                    // InternalGithubaction.g:707:6: lv_outputs_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getOutputsEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_outputs_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						add(
                    							current,
                    							"outputs",
                    							lv_outputs_17_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:724:4: (otherlv_18= ',' ( (lv_outputs_19_0= ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalGithubaction.g:725:5: otherlv_18= ',' ( (lv_outputs_19_0= ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getJobAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalGithubaction.g:729:5: ( (lv_outputs_19_0= ruleEString ) )
                    	    // InternalGithubaction.g:730:6: (lv_outputs_19_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:730:6: (lv_outputs_19_0= ruleEString )
                    	    // InternalGithubaction.g:731:7: lv_outputs_19_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobAccess().getOutputsEStringParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_outputs_19_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJobRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"outputs",
                    	    								lv_outputs_19_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_25); 

                    				newLeafNode(otherlv_20, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:754:3: (otherlv_21= 'env' otherlv_22= '{' ( (lv_env_23_0= ruleEnv ) ) (otherlv_24= ',' ( (lv_env_25_0= ruleEnv ) ) )* otherlv_26= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalGithubaction.g:755:4: otherlv_21= 'env' otherlv_22= '{' ( (lv_env_23_0= ruleEnv ) ) (otherlv_24= ',' ( (lv_env_25_0= ruleEnv ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getJobAccess().getEnvKeyword_8_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_22, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalGithubaction.g:763:4: ( (lv_env_23_0= ruleEnv ) )
                    // InternalGithubaction.g:764:5: (lv_env_23_0= ruleEnv )
                    {
                    // InternalGithubaction.g:764:5: (lv_env_23_0= ruleEnv )
                    // InternalGithubaction.g:765:6: lv_env_23_0= ruleEnv
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getEnvEnvParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_env_23_0=ruleEnv();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						add(
                    							current,
                    							"env",
                    							lv_env_23_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.Env");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:782:4: (otherlv_24= ',' ( (lv_env_25_0= ruleEnv ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalGithubaction.g:783:5: otherlv_24= ',' ( (lv_env_25_0= ruleEnv ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getJobAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalGithubaction.g:787:5: ( (lv_env_25_0= ruleEnv ) )
                    	    // InternalGithubaction.g:788:6: (lv_env_25_0= ruleEnv )
                    	    {
                    	    // InternalGithubaction.g:788:6: (lv_env_25_0= ruleEnv )
                    	    // InternalGithubaction.g:789:7: lv_env_25_0= ruleEnv
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobAccess().getEnvEnvParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_env_25_0=ruleEnv();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJobRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"env",
                    	    								lv_env_25_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.Env");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_26); 

                    				newLeafNode(otherlv_26, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:812:3: (otherlv_27= 'defaults' otherlv_28= '{' ( (lv_defaults_29_0= ruleRunSetting ) ) (otherlv_30= ',' ( (lv_defaults_31_0= ruleRunSetting ) ) )* otherlv_32= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalGithubaction.g:813:4: otherlv_27= 'defaults' otherlv_28= '{' ( (lv_defaults_29_0= ruleRunSetting ) ) (otherlv_30= ',' ( (lv_defaults_31_0= ruleRunSetting ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getJobAccess().getDefaultsKeyword_9_0());
                    			
                    otherlv_28=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_28, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalGithubaction.g:821:4: ( (lv_defaults_29_0= ruleRunSetting ) )
                    // InternalGithubaction.g:822:5: (lv_defaults_29_0= ruleRunSetting )
                    {
                    // InternalGithubaction.g:822:5: (lv_defaults_29_0= ruleRunSetting )
                    // InternalGithubaction.g:823:6: lv_defaults_29_0= ruleRunSetting
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getDefaultsRunSettingParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_defaults_29_0=ruleRunSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						add(
                    							current,
                    							"defaults",
                    							lv_defaults_29_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.RunSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:840:4: (otherlv_30= ',' ( (lv_defaults_31_0= ruleRunSetting ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalGithubaction.g:841:5: otherlv_30= ',' ( (lv_defaults_31_0= ruleRunSetting ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getJobAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalGithubaction.g:845:5: ( (lv_defaults_31_0= ruleRunSetting ) )
                    	    // InternalGithubaction.g:846:6: (lv_defaults_31_0= ruleRunSetting )
                    	    {
                    	    // InternalGithubaction.g:846:6: (lv_defaults_31_0= ruleRunSetting )
                    	    // InternalGithubaction.g:847:7: lv_defaults_31_0= ruleRunSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobAccess().getDefaultsRunSettingParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_defaults_31_0=ruleRunSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJobRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"defaults",
                    	    								lv_defaults_31_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.RunSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,15,FOLLOW_27); 

                    				newLeafNode(otherlv_32, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:870:3: (otherlv_33= 'if' ( (lv_if_34_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalGithubaction.g:871:4: otherlv_33= 'if' ( (lv_if_34_0= ruleEString ) )
                    {
                    otherlv_33=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_33, grammarAccess.getJobAccess().getIfKeyword_10_0());
                    			
                    // InternalGithubaction.g:875:4: ( (lv_if_34_0= ruleEString ) )
                    // InternalGithubaction.g:876:5: (lv_if_34_0= ruleEString )
                    {
                    // InternalGithubaction.g:876:5: (lv_if_34_0= ruleEString )
                    // InternalGithubaction.g:877:6: lv_if_34_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getIfEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_if_34_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						set(
                    							current,
                    							"if",
                    							lv_if_34_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:895:3: (otherlv_35= 'steps' otherlv_36= '{' ( (lv_steps_37_0= ruleStep ) ) (otherlv_38= ',' ( (lv_steps_39_0= ruleStep ) ) )* otherlv_40= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalGithubaction.g:896:4: otherlv_35= 'steps' otherlv_36= '{' ( (lv_steps_37_0= ruleStep ) ) (otherlv_38= ',' ( (lv_steps_39_0= ruleStep ) ) )* otherlv_40= '}'
                    {
                    otherlv_35=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_35, grammarAccess.getJobAccess().getStepsKeyword_11_0());
                    			
                    otherlv_36=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_36, grammarAccess.getJobAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalGithubaction.g:904:4: ( (lv_steps_37_0= ruleStep ) )
                    // InternalGithubaction.g:905:5: (lv_steps_37_0= ruleStep )
                    {
                    // InternalGithubaction.g:905:5: (lv_steps_37_0= ruleStep )
                    // InternalGithubaction.g:906:6: lv_steps_37_0= ruleStep
                    {

                    						newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_steps_37_0=ruleStep();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getJobRule());
                    						}
                    						add(
                    							current,
                    							"steps",
                    							lv_steps_37_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.Step");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:923:4: (otherlv_38= ',' ( (lv_steps_39_0= ruleStep ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==14) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalGithubaction.g:924:5: otherlv_38= ',' ( (lv_steps_39_0= ruleStep ) )
                    	    {
                    	    otherlv_38=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_38, grammarAccess.getJobAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalGithubaction.g:928:5: ( (lv_steps_39_0= ruleStep ) )
                    	    // InternalGithubaction.g:929:6: (lv_steps_39_0= ruleStep )
                    	    {
                    	    // InternalGithubaction.g:929:6: (lv_steps_39_0= ruleStep )
                    	    // InternalGithubaction.g:930:7: lv_steps_39_0= ruleStep
                    	    {

                    	    							newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_steps_39_0=ruleStep();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getJobRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"steps",
                    	    								lv_steps_39_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.Step");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_40=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_40, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_41=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_41, grammarAccess.getJobAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleStep"
    // InternalGithubaction.g:961:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalGithubaction.g:961:45: (iv_ruleStep= ruleStep EOF )
            // InternalGithubaction.g:962:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalGithubaction.g:968:1: ruleStep returns [EObject current=null] : ( () otherlv_1= 'Step' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name' ( (lv_stepName_5_0= ruleEString ) ) )? (otherlv_6= 'if' ( (lv_if_7_0= ruleEString ) ) )? (otherlv_8= 'uses' ( (lv_uses_9_0= ruleEString ) ) )? (otherlv_10= 'run' otherlv_11= '{' ( (lv_run_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_run_14_0= ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'runSetting' ( (lv_runSetting_17_0= ruleRunSetting ) ) )? (otherlv_18= 'with' otherlv_19= '{' ( (lv_with_20_0= ruleInputParameter ) ) (otherlv_21= ',' ( (lv_with_22_0= ruleInputParameter ) ) )* otherlv_23= '}' )? (otherlv_24= 'entrypoint' ( (lv_entrypoint_25_0= ruleEString ) ) )? (otherlv_26= 'args' ( (lv_args_27_0= ruleEString ) ) )? (otherlv_28= 'env' otherlv_29= '{' ( (lv_env_30_0= ruleEnv ) ) (otherlv_31= ',' ( (lv_env_32_0= ruleEnv ) ) )* otherlv_33= '}' )? otherlv_34= '}' ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        AntlrDatatypeRuleToken lv_stepName_5_0 = null;

        AntlrDatatypeRuleToken lv_if_7_0 = null;

        AntlrDatatypeRuleToken lv_uses_9_0 = null;

        AntlrDatatypeRuleToken lv_run_12_0 = null;

        AntlrDatatypeRuleToken lv_run_14_0 = null;

        EObject lv_runSetting_17_0 = null;

        EObject lv_with_20_0 = null;

        EObject lv_with_22_0 = null;

        AntlrDatatypeRuleToken lv_entrypoint_25_0 = null;

        AntlrDatatypeRuleToken lv_args_27_0 = null;

        EObject lv_env_30_0 = null;

        EObject lv_env_32_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:974:2: ( ( () otherlv_1= 'Step' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name' ( (lv_stepName_5_0= ruleEString ) ) )? (otherlv_6= 'if' ( (lv_if_7_0= ruleEString ) ) )? (otherlv_8= 'uses' ( (lv_uses_9_0= ruleEString ) ) )? (otherlv_10= 'run' otherlv_11= '{' ( (lv_run_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_run_14_0= ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'runSetting' ( (lv_runSetting_17_0= ruleRunSetting ) ) )? (otherlv_18= 'with' otherlv_19= '{' ( (lv_with_20_0= ruleInputParameter ) ) (otherlv_21= ',' ( (lv_with_22_0= ruleInputParameter ) ) )* otherlv_23= '}' )? (otherlv_24= 'entrypoint' ( (lv_entrypoint_25_0= ruleEString ) ) )? (otherlv_26= 'args' ( (lv_args_27_0= ruleEString ) ) )? (otherlv_28= 'env' otherlv_29= '{' ( (lv_env_30_0= ruleEnv ) ) (otherlv_31= ',' ( (lv_env_32_0= ruleEnv ) ) )* otherlv_33= '}' )? otherlv_34= '}' ) )
            // InternalGithubaction.g:975:2: ( () otherlv_1= 'Step' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name' ( (lv_stepName_5_0= ruleEString ) ) )? (otherlv_6= 'if' ( (lv_if_7_0= ruleEString ) ) )? (otherlv_8= 'uses' ( (lv_uses_9_0= ruleEString ) ) )? (otherlv_10= 'run' otherlv_11= '{' ( (lv_run_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_run_14_0= ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'runSetting' ( (lv_runSetting_17_0= ruleRunSetting ) ) )? (otherlv_18= 'with' otherlv_19= '{' ( (lv_with_20_0= ruleInputParameter ) ) (otherlv_21= ',' ( (lv_with_22_0= ruleInputParameter ) ) )* otherlv_23= '}' )? (otherlv_24= 'entrypoint' ( (lv_entrypoint_25_0= ruleEString ) ) )? (otherlv_26= 'args' ( (lv_args_27_0= ruleEString ) ) )? (otherlv_28= 'env' otherlv_29= '{' ( (lv_env_30_0= ruleEnv ) ) (otherlv_31= ',' ( (lv_env_32_0= ruleEnv ) ) )* otherlv_33= '}' )? otherlv_34= '}' )
            {
            // InternalGithubaction.g:975:2: ( () otherlv_1= 'Step' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name' ( (lv_stepName_5_0= ruleEString ) ) )? (otherlv_6= 'if' ( (lv_if_7_0= ruleEString ) ) )? (otherlv_8= 'uses' ( (lv_uses_9_0= ruleEString ) ) )? (otherlv_10= 'run' otherlv_11= '{' ( (lv_run_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_run_14_0= ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'runSetting' ( (lv_runSetting_17_0= ruleRunSetting ) ) )? (otherlv_18= 'with' otherlv_19= '{' ( (lv_with_20_0= ruleInputParameter ) ) (otherlv_21= ',' ( (lv_with_22_0= ruleInputParameter ) ) )* otherlv_23= '}' )? (otherlv_24= 'entrypoint' ( (lv_entrypoint_25_0= ruleEString ) ) )? (otherlv_26= 'args' ( (lv_args_27_0= ruleEString ) ) )? (otherlv_28= 'env' otherlv_29= '{' ( (lv_env_30_0= ruleEnv ) ) (otherlv_31= ',' ( (lv_env_32_0= ruleEnv ) ) )* otherlv_33= '}' )? otherlv_34= '}' )
            // InternalGithubaction.g:976:3: () otherlv_1= 'Step' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' (otherlv_4= 'name' ( (lv_stepName_5_0= ruleEString ) ) )? (otherlv_6= 'if' ( (lv_if_7_0= ruleEString ) ) )? (otherlv_8= 'uses' ( (lv_uses_9_0= ruleEString ) ) )? (otherlv_10= 'run' otherlv_11= '{' ( (lv_run_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_run_14_0= ruleEString ) ) )* otherlv_15= '}' )? (otherlv_16= 'runSetting' ( (lv_runSetting_17_0= ruleRunSetting ) ) )? (otherlv_18= 'with' otherlv_19= '{' ( (lv_with_20_0= ruleInputParameter ) ) (otherlv_21= ',' ( (lv_with_22_0= ruleInputParameter ) ) )* otherlv_23= '}' )? (otherlv_24= 'entrypoint' ( (lv_entrypoint_25_0= ruleEString ) ) )? (otherlv_26= 'args' ( (lv_args_27_0= ruleEString ) ) )? (otherlv_28= 'env' otherlv_29= '{' ( (lv_env_30_0= ruleEnv ) ) (otherlv_31= ',' ( (lv_env_32_0= ruleEnv ) ) )* otherlv_33= '}' )? otherlv_34= '}'
            {
            // InternalGithubaction.g:976:3: ()
            // InternalGithubaction.g:977:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepAccess().getStepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getStepAccess().getStepKeyword_1());
            		
            // InternalGithubaction.g:987:3: ( (lv_name_2_0= RULE_ID ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalGithubaction.g:988:4: (lv_name_2_0= RULE_ID )
                    {
                    // InternalGithubaction.g:988:4: (lv_name_2_0= RULE_ID )
                    // InternalGithubaction.g:989:5: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_3); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getStepAccess().getNameIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStepRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalGithubaction.g:1009:3: (otherlv_4= 'name' ( (lv_stepName_5_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalGithubaction.g:1010:4: otherlv_4= 'name' ( (lv_stepName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getStepAccess().getNameKeyword_4_0());
                    			
                    // InternalGithubaction.g:1014:4: ( (lv_stepName_5_0= ruleEString ) )
                    // InternalGithubaction.g:1015:5: (lv_stepName_5_0= ruleEString )
                    {
                    // InternalGithubaction.g:1015:5: (lv_stepName_5_0= ruleEString )
                    // InternalGithubaction.g:1016:6: lv_stepName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getStepNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_stepName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"stepName",
                    							lv_stepName_5_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:1034:3: (otherlv_6= 'if' ( (lv_if_7_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalGithubaction.g:1035:4: otherlv_6= 'if' ( (lv_if_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,29,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getStepAccess().getIfKeyword_5_0());
                    			
                    // InternalGithubaction.g:1039:4: ( (lv_if_7_0= ruleEString ) )
                    // InternalGithubaction.g:1040:5: (lv_if_7_0= ruleEString )
                    {
                    // InternalGithubaction.g:1040:5: (lv_if_7_0= ruleEString )
                    // InternalGithubaction.g:1041:6: lv_if_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getIfEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_if_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"if",
                    							lv_if_7_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:1059:3: (otherlv_8= 'uses' ( (lv_uses_9_0= ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalGithubaction.g:1060:4: otherlv_8= 'uses' ( (lv_uses_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getStepAccess().getUsesKeyword_6_0());
                    			
                    // InternalGithubaction.g:1064:4: ( (lv_uses_9_0= ruleEString ) )
                    // InternalGithubaction.g:1065:5: (lv_uses_9_0= ruleEString )
                    {
                    // InternalGithubaction.g:1065:5: (lv_uses_9_0= ruleEString )
                    // InternalGithubaction.g:1066:6: lv_uses_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getUsesEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_uses_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"uses",
                    							lv_uses_9_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:1084:3: (otherlv_10= 'run' otherlv_11= '{' ( (lv_run_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_run_14_0= ruleEString ) ) )* otherlv_15= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalGithubaction.g:1085:4: otherlv_10= 'run' otherlv_11= '{' ( (lv_run_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_run_14_0= ruleEString ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getStepAccess().getRunKeyword_7_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalGithubaction.g:1093:4: ( (lv_run_12_0= ruleEString ) )
                    // InternalGithubaction.g:1094:5: (lv_run_12_0= ruleEString )
                    {
                    // InternalGithubaction.g:1094:5: (lv_run_12_0= ruleEString )
                    // InternalGithubaction.g:1095:6: lv_run_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getRunEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_run_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						add(
                    							current,
                    							"run",
                    							lv_run_12_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:1112:4: (otherlv_13= ',' ( (lv_run_14_0= ruleEString ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==14) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalGithubaction.g:1113:5: otherlv_13= ',' ( (lv_run_14_0= ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getStepAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalGithubaction.g:1117:5: ( (lv_run_14_0= ruleEString ) )
                    	    // InternalGithubaction.g:1118:6: (lv_run_14_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:1118:6: (lv_run_14_0= ruleEString )
                    	    // InternalGithubaction.g:1119:7: lv_run_14_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getStepAccess().getRunEStringParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_run_14_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStepRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"run",
                    	    								lv_run_14_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_35); 

                    				newLeafNode(otherlv_15, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:1142:3: (otherlv_16= 'runSetting' ( (lv_runSetting_17_0= ruleRunSetting ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalGithubaction.g:1143:4: otherlv_16= 'runSetting' ( (lv_runSetting_17_0= ruleRunSetting ) )
                    {
                    otherlv_16=(Token)match(input,34,FOLLOW_14); 

                    				newLeafNode(otherlv_16, grammarAccess.getStepAccess().getRunSettingKeyword_8_0());
                    			
                    // InternalGithubaction.g:1147:4: ( (lv_runSetting_17_0= ruleRunSetting ) )
                    // InternalGithubaction.g:1148:5: (lv_runSetting_17_0= ruleRunSetting )
                    {
                    // InternalGithubaction.g:1148:5: (lv_runSetting_17_0= ruleRunSetting )
                    // InternalGithubaction.g:1149:6: lv_runSetting_17_0= ruleRunSetting
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getRunSettingRunSettingParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_runSetting_17_0=ruleRunSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"runSetting",
                    							lv_runSetting_17_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.RunSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:1167:3: (otherlv_18= 'with' otherlv_19= '{' ( (lv_with_20_0= ruleInputParameter ) ) (otherlv_21= ',' ( (lv_with_22_0= ruleInputParameter ) ) )* otherlv_23= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalGithubaction.g:1168:4: otherlv_18= 'with' otherlv_19= '{' ( (lv_with_20_0= ruleInputParameter ) ) (otherlv_21= ',' ( (lv_with_22_0= ruleInputParameter ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getStepAccess().getWithKeyword_9_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_19, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalGithubaction.g:1176:4: ( (lv_with_20_0= ruleInputParameter ) )
                    // InternalGithubaction.g:1177:5: (lv_with_20_0= ruleInputParameter )
                    {
                    // InternalGithubaction.g:1177:5: (lv_with_20_0= ruleInputParameter )
                    // InternalGithubaction.g:1178:6: lv_with_20_0= ruleInputParameter
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getWithInputParameterParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_with_20_0=ruleInputParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						add(
                    							current,
                    							"with",
                    							lv_with_20_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.InputParameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:1195:4: (otherlv_21= ',' ( (lv_with_22_0= ruleInputParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalGithubaction.g:1196:5: otherlv_21= ',' ( (lv_with_22_0= ruleInputParameter ) )
                    	    {
                    	    otherlv_21=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getStepAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalGithubaction.g:1200:5: ( (lv_with_22_0= ruleInputParameter ) )
                    	    // InternalGithubaction.g:1201:6: (lv_with_22_0= ruleInputParameter )
                    	    {
                    	    // InternalGithubaction.g:1201:6: (lv_with_22_0= ruleInputParameter )
                    	    // InternalGithubaction.g:1202:7: lv_with_22_0= ruleInputParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getStepAccess().getWithInputParameterParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_with_22_0=ruleInputParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStepRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"with",
                    	    								lv_with_22_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.InputParameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,15,FOLLOW_37); 

                    				newLeafNode(otherlv_23, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:1225:3: (otherlv_24= 'entrypoint' ( (lv_entrypoint_25_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==36) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalGithubaction.g:1226:4: otherlv_24= 'entrypoint' ( (lv_entrypoint_25_0= ruleEString ) )
                    {
                    otherlv_24=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_24, grammarAccess.getStepAccess().getEntrypointKeyword_10_0());
                    			
                    // InternalGithubaction.g:1230:4: ( (lv_entrypoint_25_0= ruleEString ) )
                    // InternalGithubaction.g:1231:5: (lv_entrypoint_25_0= ruleEString )
                    {
                    // InternalGithubaction.g:1231:5: (lv_entrypoint_25_0= ruleEString )
                    // InternalGithubaction.g:1232:6: lv_entrypoint_25_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getEntrypointEStringParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_entrypoint_25_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"entrypoint",
                    							lv_entrypoint_25_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:1250:3: (otherlv_26= 'args' ( (lv_args_27_0= ruleEString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalGithubaction.g:1251:4: otherlv_26= 'args' ( (lv_args_27_0= ruleEString ) )
                    {
                    otherlv_26=(Token)match(input,37,FOLLOW_9); 

                    				newLeafNode(otherlv_26, grammarAccess.getStepAccess().getArgsKeyword_11_0());
                    			
                    // InternalGithubaction.g:1255:4: ( (lv_args_27_0= ruleEString ) )
                    // InternalGithubaction.g:1256:5: (lv_args_27_0= ruleEString )
                    {
                    // InternalGithubaction.g:1256:5: (lv_args_27_0= ruleEString )
                    // InternalGithubaction.g:1257:6: lv_args_27_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getArgsEStringParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_args_27_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						set(
                    							current,
                    							"args",
                    							lv_args_27_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:1275:3: (otherlv_28= 'env' otherlv_29= '{' ( (lv_env_30_0= ruleEnv ) ) (otherlv_31= ',' ( (lv_env_32_0= ruleEnv ) ) )* otherlv_33= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==19) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalGithubaction.g:1276:4: otherlv_28= 'env' otherlv_29= '{' ( (lv_env_30_0= ruleEnv ) ) (otherlv_31= ',' ( (lv_env_32_0= ruleEnv ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getStepAccess().getEnvKeyword_12_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_29, grammarAccess.getStepAccess().getLeftCurlyBracketKeyword_12_1());
                    			
                    // InternalGithubaction.g:1284:4: ( (lv_env_30_0= ruleEnv ) )
                    // InternalGithubaction.g:1285:5: (lv_env_30_0= ruleEnv )
                    {
                    // InternalGithubaction.g:1285:5: (lv_env_30_0= ruleEnv )
                    // InternalGithubaction.g:1286:6: lv_env_30_0= ruleEnv
                    {

                    						newCompositeNode(grammarAccess.getStepAccess().getEnvEnvParserRuleCall_12_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_env_30_0=ruleEnv();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStepRule());
                    						}
                    						add(
                    							current,
                    							"env",
                    							lv_env_30_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.Env");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:1303:4: (otherlv_31= ',' ( (lv_env_32_0= ruleEnv ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalGithubaction.g:1304:5: otherlv_31= ',' ( (lv_env_32_0= ruleEnv ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getStepAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalGithubaction.g:1308:5: ( (lv_env_32_0= ruleEnv ) )
                    	    // InternalGithubaction.g:1309:6: (lv_env_32_0= ruleEnv )
                    	    {
                    	    // InternalGithubaction.g:1309:6: (lv_env_32_0= ruleEnv )
                    	    // InternalGithubaction.g:1310:7: lv_env_32_0= ruleEnv
                    	    {

                    	    							newCompositeNode(grammarAccess.getStepAccess().getEnvEnvParserRuleCall_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_env_32_0=ruleEnv();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStepRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"env",
                    	    								lv_env_32_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.Env");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_33, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_34=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_34, grammarAccess.getStepAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleEnv"
    // InternalGithubaction.g:1341:1: entryRuleEnv returns [EObject current=null] : iv_ruleEnv= ruleEnv EOF ;
    public final EObject entryRuleEnv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnv = null;


        try {
            // InternalGithubaction.g:1341:44: (iv_ruleEnv= ruleEnv EOF )
            // InternalGithubaction.g:1342:2: iv_ruleEnv= ruleEnv EOF
            {
             newCompositeNode(grammarAccess.getEnvRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnv=ruleEnv();

            state._fsp--;

             current =iv_ruleEnv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnv"


    // $ANTLR start "ruleEnv"
    // InternalGithubaction.g:1348:1: ruleEnv returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleEnv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:1354:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalGithubaction.g:1355:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalGithubaction.g:1355:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalGithubaction.g:1356:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalGithubaction.g:1356:3: ()
            // InternalGithubaction.g:1357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvAccess().getEnvAction_0(),
            					current);
            			

            }

            // InternalGithubaction.g:1363:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGithubaction.g:1364:4: (lv_name_1_0= ruleEString )
            {
            // InternalGithubaction.g:1364:4: (lv_name_1_0= ruleEString )
            // InternalGithubaction.g:1365:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvAccess().getColonKeyword_2());
            		
            // InternalGithubaction.g:1386:3: ( (lv_value_3_0= ruleEString ) )
            // InternalGithubaction.g:1387:4: (lv_value_3_0= ruleEString )
            {
            // InternalGithubaction.g:1387:4: (lv_value_3_0= ruleEString )
            // InternalGithubaction.g:1388:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnv"


    // $ANTLR start "entryRuleInputParameter"
    // InternalGithubaction.g:1409:1: entryRuleInputParameter returns [EObject current=null] : iv_ruleInputParameter= ruleInputParameter EOF ;
    public final EObject entryRuleInputParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputParameter = null;


        try {
            // InternalGithubaction.g:1409:55: (iv_ruleInputParameter= ruleInputParameter EOF )
            // InternalGithubaction.g:1410:2: iv_ruleInputParameter= ruleInputParameter EOF
            {
             newCompositeNode(grammarAccess.getInputParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputParameter=ruleInputParameter();

            state._fsp--;

             current =iv_ruleInputParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputParameter"


    // $ANTLR start "ruleInputParameter"
    // InternalGithubaction.g:1416:1: ruleInputParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleInputParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:1422:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalGithubaction.g:1423:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalGithubaction.g:1423:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) ) )
            // InternalGithubaction.g:1424:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalGithubaction.g:1424:3: ()
            // InternalGithubaction.g:1425:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputParameterAccess().getInputParameterAction_0(),
            					current);
            			

            }

            // InternalGithubaction.g:1431:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGithubaction.g:1432:4: (lv_name_1_0= ruleEString )
            {
            // InternalGithubaction.g:1432:4: (lv_name_1_0= ruleEString )
            // InternalGithubaction.g:1433:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_40);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getInputParameterAccess().getColonKeyword_2());
            		
            // InternalGithubaction.g:1454:3: ( (lv_value_3_0= ruleEString ) )
            // InternalGithubaction.g:1455:4: (lv_value_3_0= ruleEString )
            {
            // InternalGithubaction.g:1455:4: (lv_value_3_0= ruleEString )
            // InternalGithubaction.g:1456:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputParameterAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputParameterRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputParameter"


    // $ANTLR start "entryRuleRunSetting"
    // InternalGithubaction.g:1477:1: entryRuleRunSetting returns [EObject current=null] : iv_ruleRunSetting= ruleRunSetting EOF ;
    public final EObject entryRuleRunSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunSetting = null;


        try {
            // InternalGithubaction.g:1477:51: (iv_ruleRunSetting= ruleRunSetting EOF )
            // InternalGithubaction.g:1478:2: iv_ruleRunSetting= ruleRunSetting EOF
            {
             newCompositeNode(grammarAccess.getRunSettingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunSetting=ruleRunSetting();

            state._fsp--;

             current =iv_ruleRunSetting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRunSetting"


    // $ANTLR start "ruleRunSetting"
    // InternalGithubaction.g:1484:1: ruleRunSetting returns [EObject current=null] : ( () otherlv_1= 'RunSetting' otherlv_2= '{' (otherlv_3= 'workingDirectory' ( (lv_workingDirectory_4_0= ruleEString ) ) )? (otherlv_5= 'shell' ( (lv_shell_6_0= ruleEString ) ) )? (otherlv_7= 'with' otherlv_8= '{' ( (lv_with_9_0= ruleEnv ) ) (otherlv_10= ',' ( (lv_with_11_0= ruleEnv ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleRunSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_workingDirectory_4_0 = null;

        AntlrDatatypeRuleToken lv_shell_6_0 = null;

        EObject lv_with_9_0 = null;

        EObject lv_with_11_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:1490:2: ( ( () otherlv_1= 'RunSetting' otherlv_2= '{' (otherlv_3= 'workingDirectory' ( (lv_workingDirectory_4_0= ruleEString ) ) )? (otherlv_5= 'shell' ( (lv_shell_6_0= ruleEString ) ) )? (otherlv_7= 'with' otherlv_8= '{' ( (lv_with_9_0= ruleEnv ) ) (otherlv_10= ',' ( (lv_with_11_0= ruleEnv ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalGithubaction.g:1491:2: ( () otherlv_1= 'RunSetting' otherlv_2= '{' (otherlv_3= 'workingDirectory' ( (lv_workingDirectory_4_0= ruleEString ) ) )? (otherlv_5= 'shell' ( (lv_shell_6_0= ruleEString ) ) )? (otherlv_7= 'with' otherlv_8= '{' ( (lv_with_9_0= ruleEnv ) ) (otherlv_10= ',' ( (lv_with_11_0= ruleEnv ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalGithubaction.g:1491:2: ( () otherlv_1= 'RunSetting' otherlv_2= '{' (otherlv_3= 'workingDirectory' ( (lv_workingDirectory_4_0= ruleEString ) ) )? (otherlv_5= 'shell' ( (lv_shell_6_0= ruleEString ) ) )? (otherlv_7= 'with' otherlv_8= '{' ( (lv_with_9_0= ruleEnv ) ) (otherlv_10= ',' ( (lv_with_11_0= ruleEnv ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalGithubaction.g:1492:3: () otherlv_1= 'RunSetting' otherlv_2= '{' (otherlv_3= 'workingDirectory' ( (lv_workingDirectory_4_0= ruleEString ) ) )? (otherlv_5= 'shell' ( (lv_shell_6_0= ruleEString ) ) )? (otherlv_7= 'with' otherlv_8= '{' ( (lv_with_9_0= ruleEnv ) ) (otherlv_10= ',' ( (lv_with_11_0= ruleEnv ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalGithubaction.g:1492:3: ()
            // InternalGithubaction.g:1493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRunSettingAccess().getRunSettingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRunSettingAccess().getRunSettingKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getRunSettingAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGithubaction.g:1507:3: (otherlv_3= 'workingDirectory' ( (lv_workingDirectory_4_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalGithubaction.g:1508:4: otherlv_3= 'workingDirectory' ( (lv_workingDirectory_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,40,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getRunSettingAccess().getWorkingDirectoryKeyword_3_0());
                    			
                    // InternalGithubaction.g:1512:4: ( (lv_workingDirectory_4_0= ruleEString ) )
                    // InternalGithubaction.g:1513:5: (lv_workingDirectory_4_0= ruleEString )
                    {
                    // InternalGithubaction.g:1513:5: (lv_workingDirectory_4_0= ruleEString )
                    // InternalGithubaction.g:1514:6: lv_workingDirectory_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRunSettingAccess().getWorkingDirectoryEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_workingDirectory_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRunSettingRule());
                    						}
                    						set(
                    							current,
                    							"workingDirectory",
                    							lv_workingDirectory_4_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:1532:3: (otherlv_5= 'shell' ( (lv_shell_6_0= ruleEString ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalGithubaction.g:1533:4: otherlv_5= 'shell' ( (lv_shell_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getRunSettingAccess().getShellKeyword_4_0());
                    			
                    // InternalGithubaction.g:1537:4: ( (lv_shell_6_0= ruleEString ) )
                    // InternalGithubaction.g:1538:5: (lv_shell_6_0= ruleEString )
                    {
                    // InternalGithubaction.g:1538:5: (lv_shell_6_0= ruleEString )
                    // InternalGithubaction.g:1539:6: lv_shell_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRunSettingAccess().getShellEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_shell_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRunSettingRule());
                    						}
                    						set(
                    							current,
                    							"shell",
                    							lv_shell_6_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:1557:3: (otherlv_7= 'with' otherlv_8= '{' ( (lv_with_9_0= ruleEnv ) ) (otherlv_10= ',' ( (lv_with_11_0= ruleEnv ) ) )* otherlv_12= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==35) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalGithubaction.g:1558:4: otherlv_7= 'with' otherlv_8= '{' ( (lv_with_9_0= ruleEnv ) ) (otherlv_10= ',' ( (lv_with_11_0= ruleEnv ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getRunSettingAccess().getWithKeyword_5_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_8, grammarAccess.getRunSettingAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGithubaction.g:1566:4: ( (lv_with_9_0= ruleEnv ) )
                    // InternalGithubaction.g:1567:5: (lv_with_9_0= ruleEnv )
                    {
                    // InternalGithubaction.g:1567:5: (lv_with_9_0= ruleEnv )
                    // InternalGithubaction.g:1568:6: lv_with_9_0= ruleEnv
                    {

                    						newCompositeNode(grammarAccess.getRunSettingAccess().getWithEnvParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_with_9_0=ruleEnv();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRunSettingRule());
                    						}
                    						add(
                    							current,
                    							"with",
                    							lv_with_9_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.Env");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:1585:4: (otherlv_10= ',' ( (lv_with_11_0= ruleEnv ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==14) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalGithubaction.g:1586:5: otherlv_10= ',' ( (lv_with_11_0= ruleEnv ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRunSettingAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGithubaction.g:1590:5: ( (lv_with_11_0= ruleEnv ) )
                    	    // InternalGithubaction.g:1591:6: (lv_with_11_0= ruleEnv )
                    	    {
                    	    // InternalGithubaction.g:1591:6: (lv_with_11_0= ruleEnv )
                    	    // InternalGithubaction.g:1592:7: lv_with_11_0= ruleEnv
                    	    {

                    	    							newCompositeNode(grammarAccess.getRunSettingAccess().getWithEnvParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_with_11_0=ruleEnv();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRunSettingRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"with",
                    	    								lv_with_11_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.Env");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getRunSettingAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getRunSettingAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRunSetting"


    // $ANTLR start "entryRulePushEvent"
    // InternalGithubaction.g:1623:1: entryRulePushEvent returns [EObject current=null] : iv_rulePushEvent= rulePushEvent EOF ;
    public final EObject entryRulePushEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePushEvent = null;


        try {
            // InternalGithubaction.g:1623:50: (iv_rulePushEvent= rulePushEvent EOF )
            // InternalGithubaction.g:1624:2: iv_rulePushEvent= rulePushEvent EOF
            {
             newCompositeNode(grammarAccess.getPushEventRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePushEvent=rulePushEvent();

            state._fsp--;

             current =iv_rulePushEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePushEvent"


    // $ANTLR start "rulePushEvent"
    // InternalGithubaction.g:1630:1: rulePushEvent returns [EObject current=null] : ( () otherlv_1= 'PushEvent' otherlv_2= '{' (otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}' )? (otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}' )? (otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
    public final EObject rulePushEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        AntlrDatatypeRuleToken lv_branches_5_0 = null;

        AntlrDatatypeRuleToken lv_branches_7_0 = null;

        AntlrDatatypeRuleToken lv_tags_11_0 = null;

        AntlrDatatypeRuleToken lv_tags_13_0 = null;

        AntlrDatatypeRuleToken lv_branchesIgnore_17_0 = null;

        AntlrDatatypeRuleToken lv_branchesIgnore_19_0 = null;

        AntlrDatatypeRuleToken lv_tagsIgnore_23_0 = null;

        AntlrDatatypeRuleToken lv_tagsIgnore_25_0 = null;

        AntlrDatatypeRuleToken lv_paths_29_0 = null;

        AntlrDatatypeRuleToken lv_paths_31_0 = null;

        AntlrDatatypeRuleToken lv_pathsIgnore_35_0 = null;

        AntlrDatatypeRuleToken lv_pathsIgnore_37_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:1636:2: ( ( () otherlv_1= 'PushEvent' otherlv_2= '{' (otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}' )? (otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}' )? (otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // InternalGithubaction.g:1637:2: ( () otherlv_1= 'PushEvent' otherlv_2= '{' (otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}' )? (otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}' )? (otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // InternalGithubaction.g:1637:2: ( () otherlv_1= 'PushEvent' otherlv_2= '{' (otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}' )? (otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}' )? (otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // InternalGithubaction.g:1638:3: () otherlv_1= 'PushEvent' otherlv_2= '{' (otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}' )? (otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}' )? (otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            // InternalGithubaction.g:1638:3: ()
            // InternalGithubaction.g:1639:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPushEventAccess().getPushEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPushEventAccess().getPushEventKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getPushEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGithubaction.g:1653:3: (otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalGithubaction.g:1654:4: otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPushEventAccess().getBranchesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getPushEventAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalGithubaction.g:1662:4: ( (lv_branches_5_0= ruleEString ) )
                    // InternalGithubaction.g:1663:5: (lv_branches_5_0= ruleEString )
                    {
                    // InternalGithubaction.g:1663:5: (lv_branches_5_0= ruleEString )
                    // InternalGithubaction.g:1664:6: lv_branches_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPushEventAccess().getBranchesEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_branches_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPushEventRule());
                    						}
                    						add(
                    							current,
                    							"branches",
                    							lv_branches_5_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:1681:4: (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==14) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalGithubaction.g:1682:5: otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPushEventAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalGithubaction.g:1686:5: ( (lv_branches_7_0= ruleEString ) )
                    	    // InternalGithubaction.g:1687:6: (lv_branches_7_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:1687:6: (lv_branches_7_0= ruleEString )
                    	    // InternalGithubaction.g:1688:7: lv_branches_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPushEventAccess().getBranchesEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_branches_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPushEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"branches",
                    	    								lv_branches_7_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_45); 

                    				newLeafNode(otherlv_8, grammarAccess.getPushEventAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:1711:3: (otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalGithubaction.g:1712:4: otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getPushEventAccess().getTagsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getPushEventAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalGithubaction.g:1720:4: ( (lv_tags_11_0= ruleEString ) )
                    // InternalGithubaction.g:1721:5: (lv_tags_11_0= ruleEString )
                    {
                    // InternalGithubaction.g:1721:5: (lv_tags_11_0= ruleEString )
                    // InternalGithubaction.g:1722:6: lv_tags_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPushEventAccess().getTagsEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_tags_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPushEventRule());
                    						}
                    						add(
                    							current,
                    							"tags",
                    							lv_tags_11_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:1739:4: (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==14) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalGithubaction.g:1740:5: otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPushEventAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGithubaction.g:1744:5: ( (lv_tags_13_0= ruleEString ) )
                    	    // InternalGithubaction.g:1745:6: (lv_tags_13_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:1745:6: (lv_tags_13_0= ruleEString )
                    	    // InternalGithubaction.g:1746:7: lv_tags_13_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPushEventAccess().getTagsEStringParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_tags_13_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPushEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tags",
                    	    								lv_tags_13_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_46); 

                    				newLeafNode(otherlv_14, grammarAccess.getPushEventAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:1769:3: (otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==45) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalGithubaction.g:1770:4: otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getPushEventAccess().getBranchesIgnoreKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getPushEventAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGithubaction.g:1778:4: ( (lv_branchesIgnore_17_0= ruleEString ) )
                    // InternalGithubaction.g:1779:5: (lv_branchesIgnore_17_0= ruleEString )
                    {
                    // InternalGithubaction.g:1779:5: (lv_branchesIgnore_17_0= ruleEString )
                    // InternalGithubaction.g:1780:6: lv_branchesIgnore_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPushEventAccess().getBranchesIgnoreEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_branchesIgnore_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPushEventRule());
                    						}
                    						add(
                    							current,
                    							"branchesIgnore",
                    							lv_branchesIgnore_17_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:1797:4: (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==14) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalGithubaction.g:1798:5: otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getPushEventAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGithubaction.g:1802:5: ( (lv_branchesIgnore_19_0= ruleEString ) )
                    	    // InternalGithubaction.g:1803:6: (lv_branchesIgnore_19_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:1803:6: (lv_branchesIgnore_19_0= ruleEString )
                    	    // InternalGithubaction.g:1804:7: lv_branchesIgnore_19_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPushEventAccess().getBranchesIgnoreEStringParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_branchesIgnore_19_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPushEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"branchesIgnore",
                    	    								lv_branchesIgnore_19_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_47); 

                    				newLeafNode(otherlv_20, grammarAccess.getPushEventAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:1827:3: (otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalGithubaction.g:1828:4: otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getPushEventAccess().getTagsIgnoreKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_22, grammarAccess.getPushEventAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGithubaction.g:1836:4: ( (lv_tagsIgnore_23_0= ruleEString ) )
                    // InternalGithubaction.g:1837:5: (lv_tagsIgnore_23_0= ruleEString )
                    {
                    // InternalGithubaction.g:1837:5: (lv_tagsIgnore_23_0= ruleEString )
                    // InternalGithubaction.g:1838:6: lv_tagsIgnore_23_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPushEventAccess().getTagsIgnoreEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_tagsIgnore_23_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPushEventRule());
                    						}
                    						add(
                    							current,
                    							"tagsIgnore",
                    							lv_tagsIgnore_23_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:1855:4: (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalGithubaction.g:1856:5: otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getPushEventAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGithubaction.g:1860:5: ( (lv_tagsIgnore_25_0= ruleEString ) )
                    	    // InternalGithubaction.g:1861:6: (lv_tagsIgnore_25_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:1861:6: (lv_tagsIgnore_25_0= ruleEString )
                    	    // InternalGithubaction.g:1862:7: lv_tagsIgnore_25_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPushEventAccess().getTagsIgnoreEStringParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_tagsIgnore_25_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPushEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tagsIgnore",
                    	    								lv_tagsIgnore_25_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_48); 

                    				newLeafNode(otherlv_26, grammarAccess.getPushEventAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:1885:3: (otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==47) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalGithubaction.g:1886:4: otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getPushEventAccess().getPathsKeyword_7_0());
                    			
                    otherlv_28=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_28, grammarAccess.getPushEventAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalGithubaction.g:1894:4: ( (lv_paths_29_0= ruleEString ) )
                    // InternalGithubaction.g:1895:5: (lv_paths_29_0= ruleEString )
                    {
                    // InternalGithubaction.g:1895:5: (lv_paths_29_0= ruleEString )
                    // InternalGithubaction.g:1896:6: lv_paths_29_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPushEventAccess().getPathsEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_paths_29_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPushEventRule());
                    						}
                    						add(
                    							current,
                    							"paths",
                    							lv_paths_29_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:1913:4: (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==14) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalGithubaction.g:1914:5: otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getPushEventAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalGithubaction.g:1918:5: ( (lv_paths_31_0= ruleEString ) )
                    	    // InternalGithubaction.g:1919:6: (lv_paths_31_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:1919:6: (lv_paths_31_0= ruleEString )
                    	    // InternalGithubaction.g:1920:7: lv_paths_31_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPushEventAccess().getPathsEStringParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_paths_31_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPushEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"paths",
                    	    								lv_paths_31_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,15,FOLLOW_49); 

                    				newLeafNode(otherlv_32, grammarAccess.getPushEventAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:1943:3: (otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==48) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalGithubaction.g:1944:4: otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_33, grammarAccess.getPushEventAccess().getPathsIgnoreKeyword_8_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_34, grammarAccess.getPushEventAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalGithubaction.g:1952:4: ( (lv_pathsIgnore_35_0= ruleEString ) )
                    // InternalGithubaction.g:1953:5: (lv_pathsIgnore_35_0= ruleEString )
                    {
                    // InternalGithubaction.g:1953:5: (lv_pathsIgnore_35_0= ruleEString )
                    // InternalGithubaction.g:1954:6: lv_pathsIgnore_35_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPushEventAccess().getPathsIgnoreEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_pathsIgnore_35_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPushEventRule());
                    						}
                    						add(
                    							current,
                    							"pathsIgnore",
                    							lv_pathsIgnore_35_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:1971:4: (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==14) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalGithubaction.g:1972:5: otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getPushEventAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalGithubaction.g:1976:5: ( (lv_pathsIgnore_37_0= ruleEString ) )
                    	    // InternalGithubaction.g:1977:6: (lv_pathsIgnore_37_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:1977:6: (lv_pathsIgnore_37_0= ruleEString )
                    	    // InternalGithubaction.g:1978:7: lv_pathsIgnore_37_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPushEventAccess().getPathsIgnoreEStringParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_pathsIgnore_37_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPushEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pathsIgnore",
                    	    								lv_pathsIgnore_37_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_38, grammarAccess.getPushEventAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_39=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_39, grammarAccess.getPushEventAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePushEvent"


    // $ANTLR start "entryRulePullRequestEvent"
    // InternalGithubaction.g:2009:1: entryRulePullRequestEvent returns [EObject current=null] : iv_rulePullRequestEvent= rulePullRequestEvent EOF ;
    public final EObject entryRulePullRequestEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePullRequestEvent = null;


        try {
            // InternalGithubaction.g:2009:57: (iv_rulePullRequestEvent= rulePullRequestEvent EOF )
            // InternalGithubaction.g:2010:2: iv_rulePullRequestEvent= rulePullRequestEvent EOF
            {
             newCompositeNode(grammarAccess.getPullRequestEventRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePullRequestEvent=rulePullRequestEvent();

            state._fsp--;

             current =iv_rulePullRequestEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePullRequestEvent"


    // $ANTLR start "rulePullRequestEvent"
    // InternalGithubaction.g:2016:1: rulePullRequestEvent returns [EObject current=null] : ( () otherlv_1= 'PullRequestEvent' otherlv_2= '{' (otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}' )? (otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}' )? (otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
    public final EObject rulePullRequestEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        AntlrDatatypeRuleToken lv_branches_5_0 = null;

        AntlrDatatypeRuleToken lv_branches_7_0 = null;

        AntlrDatatypeRuleToken lv_tags_11_0 = null;

        AntlrDatatypeRuleToken lv_tags_13_0 = null;

        AntlrDatatypeRuleToken lv_branchesIgnore_17_0 = null;

        AntlrDatatypeRuleToken lv_branchesIgnore_19_0 = null;

        AntlrDatatypeRuleToken lv_tagsIgnore_23_0 = null;

        AntlrDatatypeRuleToken lv_tagsIgnore_25_0 = null;

        AntlrDatatypeRuleToken lv_paths_29_0 = null;

        AntlrDatatypeRuleToken lv_paths_31_0 = null;

        AntlrDatatypeRuleToken lv_pathsIgnore_35_0 = null;

        AntlrDatatypeRuleToken lv_pathsIgnore_37_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:2022:2: ( ( () otherlv_1= 'PullRequestEvent' otherlv_2= '{' (otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}' )? (otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}' )? (otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // InternalGithubaction.g:2023:2: ( () otherlv_1= 'PullRequestEvent' otherlv_2= '{' (otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}' )? (otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}' )? (otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // InternalGithubaction.g:2023:2: ( () otherlv_1= 'PullRequestEvent' otherlv_2= '{' (otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}' )? (otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}' )? (otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // InternalGithubaction.g:2024:3: () otherlv_1= 'PullRequestEvent' otherlv_2= '{' (otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}' )? (otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}' )? (otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}' )? (otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}' )? (otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}' )? (otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            // InternalGithubaction.g:2024:3: ()
            // InternalGithubaction.g:2025:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPullRequestEventAccess().getPullRequestEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPullRequestEventAccess().getPullRequestEventKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getPullRequestEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGithubaction.g:2039:3: (otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==43) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalGithubaction.g:2040:4: otherlv_3= 'branches' otherlv_4= '{' ( (lv_branches_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPullRequestEventAccess().getBranchesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getPullRequestEventAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalGithubaction.g:2048:4: ( (lv_branches_5_0= ruleEString ) )
                    // InternalGithubaction.g:2049:5: (lv_branches_5_0= ruleEString )
                    {
                    // InternalGithubaction.g:2049:5: (lv_branches_5_0= ruleEString )
                    // InternalGithubaction.g:2050:6: lv_branches_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPullRequestEventAccess().getBranchesEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_branches_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPullRequestEventRule());
                    						}
                    						add(
                    							current,
                    							"branches",
                    							lv_branches_5_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:2067:4: (otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==14) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalGithubaction.g:2068:5: otherlv_6= ',' ( (lv_branches_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPullRequestEventAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalGithubaction.g:2072:5: ( (lv_branches_7_0= ruleEString ) )
                    	    // InternalGithubaction.g:2073:6: (lv_branches_7_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:2073:6: (lv_branches_7_0= ruleEString )
                    	    // InternalGithubaction.g:2074:7: lv_branches_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPullRequestEventAccess().getBranchesEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_branches_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPullRequestEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"branches",
                    	    								lv_branches_7_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_45); 

                    				newLeafNode(otherlv_8, grammarAccess.getPullRequestEventAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:2097:3: (otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==44) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalGithubaction.g:2098:4: otherlv_9= 'tags' otherlv_10= '{' ( (lv_tags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getPullRequestEventAccess().getTagsKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getPullRequestEventAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalGithubaction.g:2106:4: ( (lv_tags_11_0= ruleEString ) )
                    // InternalGithubaction.g:2107:5: (lv_tags_11_0= ruleEString )
                    {
                    // InternalGithubaction.g:2107:5: (lv_tags_11_0= ruleEString )
                    // InternalGithubaction.g:2108:6: lv_tags_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPullRequestEventAccess().getTagsEStringParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_tags_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPullRequestEventRule());
                    						}
                    						add(
                    							current,
                    							"tags",
                    							lv_tags_11_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:2125:4: (otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==14) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalGithubaction.g:2126:5: otherlv_12= ',' ( (lv_tags_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getPullRequestEventAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalGithubaction.g:2130:5: ( (lv_tags_13_0= ruleEString ) )
                    	    // InternalGithubaction.g:2131:6: (lv_tags_13_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:2131:6: (lv_tags_13_0= ruleEString )
                    	    // InternalGithubaction.g:2132:7: lv_tags_13_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPullRequestEventAccess().getTagsEStringParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_tags_13_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPullRequestEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tags",
                    	    								lv_tags_13_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_46); 

                    				newLeafNode(otherlv_14, grammarAccess.getPullRequestEventAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:2155:3: (otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==45) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalGithubaction.g:2156:4: otherlv_15= 'branchesIgnore' otherlv_16= '{' ( (lv_branchesIgnore_17_0= ruleEString ) ) (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getPullRequestEventAccess().getBranchesIgnoreKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getPullRequestEventAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalGithubaction.g:2164:4: ( (lv_branchesIgnore_17_0= ruleEString ) )
                    // InternalGithubaction.g:2165:5: (lv_branchesIgnore_17_0= ruleEString )
                    {
                    // InternalGithubaction.g:2165:5: (lv_branchesIgnore_17_0= ruleEString )
                    // InternalGithubaction.g:2166:6: lv_branchesIgnore_17_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPullRequestEventAccess().getBranchesIgnoreEStringParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_branchesIgnore_17_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPullRequestEventRule());
                    						}
                    						add(
                    							current,
                    							"branchesIgnore",
                    							lv_branchesIgnore_17_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:2183:4: (otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==14) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalGithubaction.g:2184:5: otherlv_18= ',' ( (lv_branchesIgnore_19_0= ruleEString ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getPullRequestEventAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalGithubaction.g:2188:5: ( (lv_branchesIgnore_19_0= ruleEString ) )
                    	    // InternalGithubaction.g:2189:6: (lv_branchesIgnore_19_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:2189:6: (lv_branchesIgnore_19_0= ruleEString )
                    	    // InternalGithubaction.g:2190:7: lv_branchesIgnore_19_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPullRequestEventAccess().getBranchesIgnoreEStringParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_branchesIgnore_19_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPullRequestEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"branchesIgnore",
                    	    								lv_branchesIgnore_19_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_47); 

                    				newLeafNode(otherlv_20, grammarAccess.getPullRequestEventAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:2213:3: (otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==46) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalGithubaction.g:2214:4: otherlv_21= 'tagsIgnore' otherlv_22= '{' ( (lv_tagsIgnore_23_0= ruleEString ) ) (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getPullRequestEventAccess().getTagsIgnoreKeyword_6_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_22, grammarAccess.getPullRequestEventAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalGithubaction.g:2222:4: ( (lv_tagsIgnore_23_0= ruleEString ) )
                    // InternalGithubaction.g:2223:5: (lv_tagsIgnore_23_0= ruleEString )
                    {
                    // InternalGithubaction.g:2223:5: (lv_tagsIgnore_23_0= ruleEString )
                    // InternalGithubaction.g:2224:6: lv_tagsIgnore_23_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPullRequestEventAccess().getTagsIgnoreEStringParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_tagsIgnore_23_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPullRequestEventRule());
                    						}
                    						add(
                    							current,
                    							"tagsIgnore",
                    							lv_tagsIgnore_23_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:2241:4: (otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==14) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalGithubaction.g:2242:5: otherlv_24= ',' ( (lv_tagsIgnore_25_0= ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getPullRequestEventAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalGithubaction.g:2246:5: ( (lv_tagsIgnore_25_0= ruleEString ) )
                    	    // InternalGithubaction.g:2247:6: (lv_tagsIgnore_25_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:2247:6: (lv_tagsIgnore_25_0= ruleEString )
                    	    // InternalGithubaction.g:2248:7: lv_tagsIgnore_25_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPullRequestEventAccess().getTagsIgnoreEStringParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_tagsIgnore_25_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPullRequestEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tagsIgnore",
                    	    								lv_tagsIgnore_25_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,15,FOLLOW_48); 

                    				newLeafNode(otherlv_26, grammarAccess.getPullRequestEventAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:2271:3: (otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==47) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalGithubaction.g:2272:4: otherlv_27= 'paths' otherlv_28= '{' ( (lv_paths_29_0= ruleEString ) ) (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_27, grammarAccess.getPullRequestEventAccess().getPathsKeyword_7_0());
                    			
                    otherlv_28=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_28, grammarAccess.getPullRequestEventAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalGithubaction.g:2280:4: ( (lv_paths_29_0= ruleEString ) )
                    // InternalGithubaction.g:2281:5: (lv_paths_29_0= ruleEString )
                    {
                    // InternalGithubaction.g:2281:5: (lv_paths_29_0= ruleEString )
                    // InternalGithubaction.g:2282:6: lv_paths_29_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPullRequestEventAccess().getPathsEStringParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_paths_29_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPullRequestEventRule());
                    						}
                    						add(
                    							current,
                    							"paths",
                    							lv_paths_29_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:2299:4: (otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==14) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // InternalGithubaction.g:2300:5: otherlv_30= ',' ( (lv_paths_31_0= ruleEString ) )
                    	    {
                    	    otherlv_30=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getPullRequestEventAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalGithubaction.g:2304:5: ( (lv_paths_31_0= ruleEString ) )
                    	    // InternalGithubaction.g:2305:6: (lv_paths_31_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:2305:6: (lv_paths_31_0= ruleEString )
                    	    // InternalGithubaction.g:2306:7: lv_paths_31_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPullRequestEventAccess().getPathsEStringParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_paths_31_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPullRequestEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"paths",
                    	    								lv_paths_31_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,15,FOLLOW_49); 

                    				newLeafNode(otherlv_32, grammarAccess.getPullRequestEventAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalGithubaction.g:2329:3: (otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==48) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalGithubaction.g:2330:4: otherlv_33= 'pathsIgnore' otherlv_34= '{' ( (lv_pathsIgnore_35_0= ruleEString ) ) (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_33, grammarAccess.getPullRequestEventAccess().getPathsIgnoreKeyword_8_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_34, grammarAccess.getPullRequestEventAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalGithubaction.g:2338:4: ( (lv_pathsIgnore_35_0= ruleEString ) )
                    // InternalGithubaction.g:2339:5: (lv_pathsIgnore_35_0= ruleEString )
                    {
                    // InternalGithubaction.g:2339:5: (lv_pathsIgnore_35_0= ruleEString )
                    // InternalGithubaction.g:2340:6: lv_pathsIgnore_35_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPullRequestEventAccess().getPathsIgnoreEStringParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_pathsIgnore_35_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPullRequestEventRule());
                    						}
                    						add(
                    							current,
                    							"pathsIgnore",
                    							lv_pathsIgnore_35_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:2357:4: (otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==14) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalGithubaction.g:2358:5: otherlv_36= ',' ( (lv_pathsIgnore_37_0= ruleEString ) )
                    	    {
                    	    otherlv_36=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getPullRequestEventAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalGithubaction.g:2362:5: ( (lv_pathsIgnore_37_0= ruleEString ) )
                    	    // InternalGithubaction.g:2363:6: (lv_pathsIgnore_37_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:2363:6: (lv_pathsIgnore_37_0= ruleEString )
                    	    // InternalGithubaction.g:2364:7: lv_pathsIgnore_37_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getPullRequestEventAccess().getPathsIgnoreEStringParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_pathsIgnore_37_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPullRequestEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pathsIgnore",
                    	    								lv_pathsIgnore_37_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_38, grammarAccess.getPullRequestEventAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_39=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_39, grammarAccess.getPullRequestEventAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePullRequestEvent"


    // $ANTLR start "entryRuleScheduleEvent"
    // InternalGithubaction.g:2395:1: entryRuleScheduleEvent returns [EObject current=null] : iv_ruleScheduleEvent= ruleScheduleEvent EOF ;
    public final EObject entryRuleScheduleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheduleEvent = null;


        try {
            // InternalGithubaction.g:2395:54: (iv_ruleScheduleEvent= ruleScheduleEvent EOF )
            // InternalGithubaction.g:2396:2: iv_ruleScheduleEvent= ruleScheduleEvent EOF
            {
             newCompositeNode(grammarAccess.getScheduleEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScheduleEvent=ruleScheduleEvent();

            state._fsp--;

             current =iv_ruleScheduleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScheduleEvent"


    // $ANTLR start "ruleScheduleEvent"
    // InternalGithubaction.g:2402:1: ruleScheduleEvent returns [EObject current=null] : ( () otherlv_1= 'ScheduleEvent' otherlv_2= '{' (otherlv_3= 'minute' ( (lv_minute_4_0= ruleEString ) ) )? (otherlv_5= 'hour' ( (lv_hour_6_0= ruleEString ) ) )? (otherlv_7= 'day' ( (lv_day_8_0= ruleEString ) ) )? (otherlv_9= 'month' ( (lv_month_10_0= ruleEString ) ) )? (otherlv_11= 'dayOfWeek' ( (lv_dayOfWeek_12_0= ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleScheduleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_minute_4_0 = null;

        AntlrDatatypeRuleToken lv_hour_6_0 = null;

        AntlrDatatypeRuleToken lv_day_8_0 = null;

        AntlrDatatypeRuleToken lv_month_10_0 = null;

        AntlrDatatypeRuleToken lv_dayOfWeek_12_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:2408:2: ( ( () otherlv_1= 'ScheduleEvent' otherlv_2= '{' (otherlv_3= 'minute' ( (lv_minute_4_0= ruleEString ) ) )? (otherlv_5= 'hour' ( (lv_hour_6_0= ruleEString ) ) )? (otherlv_7= 'day' ( (lv_day_8_0= ruleEString ) ) )? (otherlv_9= 'month' ( (lv_month_10_0= ruleEString ) ) )? (otherlv_11= 'dayOfWeek' ( (lv_dayOfWeek_12_0= ruleEString ) ) )? otherlv_13= '}' ) )
            // InternalGithubaction.g:2409:2: ( () otherlv_1= 'ScheduleEvent' otherlv_2= '{' (otherlv_3= 'minute' ( (lv_minute_4_0= ruleEString ) ) )? (otherlv_5= 'hour' ( (lv_hour_6_0= ruleEString ) ) )? (otherlv_7= 'day' ( (lv_day_8_0= ruleEString ) ) )? (otherlv_9= 'month' ( (lv_month_10_0= ruleEString ) ) )? (otherlv_11= 'dayOfWeek' ( (lv_dayOfWeek_12_0= ruleEString ) ) )? otherlv_13= '}' )
            {
            // InternalGithubaction.g:2409:2: ( () otherlv_1= 'ScheduleEvent' otherlv_2= '{' (otherlv_3= 'minute' ( (lv_minute_4_0= ruleEString ) ) )? (otherlv_5= 'hour' ( (lv_hour_6_0= ruleEString ) ) )? (otherlv_7= 'day' ( (lv_day_8_0= ruleEString ) ) )? (otherlv_9= 'month' ( (lv_month_10_0= ruleEString ) ) )? (otherlv_11= 'dayOfWeek' ( (lv_dayOfWeek_12_0= ruleEString ) ) )? otherlv_13= '}' )
            // InternalGithubaction.g:2410:3: () otherlv_1= 'ScheduleEvent' otherlv_2= '{' (otherlv_3= 'minute' ( (lv_minute_4_0= ruleEString ) ) )? (otherlv_5= 'hour' ( (lv_hour_6_0= ruleEString ) ) )? (otherlv_7= 'day' ( (lv_day_8_0= ruleEString ) ) )? (otherlv_9= 'month' ( (lv_month_10_0= ruleEString ) ) )? (otherlv_11= 'dayOfWeek' ( (lv_dayOfWeek_12_0= ruleEString ) ) )? otherlv_13= '}'
            {
            // InternalGithubaction.g:2410:3: ()
            // InternalGithubaction.g:2411:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScheduleEventAccess().getScheduleEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getScheduleEventAccess().getScheduleEventKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getScheduleEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGithubaction.g:2425:3: (otherlv_3= 'minute' ( (lv_minute_4_0= ruleEString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==51) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalGithubaction.g:2426:4: otherlv_3= 'minute' ( (lv_minute_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,51,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getScheduleEventAccess().getMinuteKeyword_3_0());
                    			
                    // InternalGithubaction.g:2430:4: ( (lv_minute_4_0= ruleEString ) )
                    // InternalGithubaction.g:2431:5: (lv_minute_4_0= ruleEString )
                    {
                    // InternalGithubaction.g:2431:5: (lv_minute_4_0= ruleEString )
                    // InternalGithubaction.g:2432:6: lv_minute_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScheduleEventAccess().getMinuteEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_minute_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScheduleEventRule());
                    						}
                    						set(
                    							current,
                    							"minute",
                    							lv_minute_4_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:2450:3: (otherlv_5= 'hour' ( (lv_hour_6_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==52) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalGithubaction.g:2451:4: otherlv_5= 'hour' ( (lv_hour_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getScheduleEventAccess().getHourKeyword_4_0());
                    			
                    // InternalGithubaction.g:2455:4: ( (lv_hour_6_0= ruleEString ) )
                    // InternalGithubaction.g:2456:5: (lv_hour_6_0= ruleEString )
                    {
                    // InternalGithubaction.g:2456:5: (lv_hour_6_0= ruleEString )
                    // InternalGithubaction.g:2457:6: lv_hour_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScheduleEventAccess().getHourEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_hour_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScheduleEventRule());
                    						}
                    						set(
                    							current,
                    							"hour",
                    							lv_hour_6_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:2475:3: (otherlv_7= 'day' ( (lv_day_8_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==53) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalGithubaction.g:2476:4: otherlv_7= 'day' ( (lv_day_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getScheduleEventAccess().getDayKeyword_5_0());
                    			
                    // InternalGithubaction.g:2480:4: ( (lv_day_8_0= ruleEString ) )
                    // InternalGithubaction.g:2481:5: (lv_day_8_0= ruleEString )
                    {
                    // InternalGithubaction.g:2481:5: (lv_day_8_0= ruleEString )
                    // InternalGithubaction.g:2482:6: lv_day_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScheduleEventAccess().getDayEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_day_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScheduleEventRule());
                    						}
                    						set(
                    							current,
                    							"day",
                    							lv_day_8_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:2500:3: (otherlv_9= 'month' ( (lv_month_10_0= ruleEString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==54) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalGithubaction.g:2501:4: otherlv_9= 'month' ( (lv_month_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getScheduleEventAccess().getMonthKeyword_6_0());
                    			
                    // InternalGithubaction.g:2505:4: ( (lv_month_10_0= ruleEString ) )
                    // InternalGithubaction.g:2506:5: (lv_month_10_0= ruleEString )
                    {
                    // InternalGithubaction.g:2506:5: (lv_month_10_0= ruleEString )
                    // InternalGithubaction.g:2507:6: lv_month_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScheduleEventAccess().getMonthEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_month_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScheduleEventRule());
                    						}
                    						set(
                    							current,
                    							"month",
                    							lv_month_10_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:2525:3: (otherlv_11= 'dayOfWeek' ( (lv_dayOfWeek_12_0= ruleEString ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==55) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalGithubaction.g:2526:4: otherlv_11= 'dayOfWeek' ( (lv_dayOfWeek_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,55,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getScheduleEventAccess().getDayOfWeekKeyword_7_0());
                    			
                    // InternalGithubaction.g:2530:4: ( (lv_dayOfWeek_12_0= ruleEString ) )
                    // InternalGithubaction.g:2531:5: (lv_dayOfWeek_12_0= ruleEString )
                    {
                    // InternalGithubaction.g:2531:5: (lv_dayOfWeek_12_0= ruleEString )
                    // InternalGithubaction.g:2532:6: lv_dayOfWeek_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getScheduleEventAccess().getDayOfWeekEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_dayOfWeek_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScheduleEventRule());
                    						}
                    						set(
                    							current,
                    							"dayOfWeek",
                    							lv_dayOfWeek_12_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getScheduleEventAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScheduleEvent"


    // $ANTLR start "entryRuleWorkflowDispatchEvent"
    // InternalGithubaction.g:2558:1: entryRuleWorkflowDispatchEvent returns [EObject current=null] : iv_ruleWorkflowDispatchEvent= ruleWorkflowDispatchEvent EOF ;
    public final EObject entryRuleWorkflowDispatchEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflowDispatchEvent = null;


        try {
            // InternalGithubaction.g:2558:62: (iv_ruleWorkflowDispatchEvent= ruleWorkflowDispatchEvent EOF )
            // InternalGithubaction.g:2559:2: iv_ruleWorkflowDispatchEvent= ruleWorkflowDispatchEvent EOF
            {
             newCompositeNode(grammarAccess.getWorkflowDispatchEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflowDispatchEvent=ruleWorkflowDispatchEvent();

            state._fsp--;

             current =iv_ruleWorkflowDispatchEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflowDispatchEvent"


    // $ANTLR start "ruleWorkflowDispatchEvent"
    // InternalGithubaction.g:2565:1: ruleWorkflowDispatchEvent returns [EObject current=null] : ( () otherlv_1= 'WorkflowDispatchEvent' otherlv_2= '{' (otherlv_3= 'inputs' otherlv_4= '{' ( (lv_inputs_5_0= ruleInput ) ) (otherlv_6= ',' ( (lv_inputs_7_0= ruleInput ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleWorkflowDispatchEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_inputs_5_0 = null;

        EObject lv_inputs_7_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:2571:2: ( ( () otherlv_1= 'WorkflowDispatchEvent' otherlv_2= '{' (otherlv_3= 'inputs' otherlv_4= '{' ( (lv_inputs_5_0= ruleInput ) ) (otherlv_6= ',' ( (lv_inputs_7_0= ruleInput ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalGithubaction.g:2572:2: ( () otherlv_1= 'WorkflowDispatchEvent' otherlv_2= '{' (otherlv_3= 'inputs' otherlv_4= '{' ( (lv_inputs_5_0= ruleInput ) ) (otherlv_6= ',' ( (lv_inputs_7_0= ruleInput ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalGithubaction.g:2572:2: ( () otherlv_1= 'WorkflowDispatchEvent' otherlv_2= '{' (otherlv_3= 'inputs' otherlv_4= '{' ( (lv_inputs_5_0= ruleInput ) ) (otherlv_6= ',' ( (lv_inputs_7_0= ruleInput ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalGithubaction.g:2573:3: () otherlv_1= 'WorkflowDispatchEvent' otherlv_2= '{' (otherlv_3= 'inputs' otherlv_4= '{' ( (lv_inputs_5_0= ruleInput ) ) (otherlv_6= ',' ( (lv_inputs_7_0= ruleInput ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalGithubaction.g:2573:3: ()
            // InternalGithubaction.g:2574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkflowDispatchEventAccess().getWorkflowDispatchEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWorkflowDispatchEventAccess().getWorkflowDispatchEventKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkflowDispatchEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGithubaction.g:2588:3: (otherlv_3= 'inputs' otherlv_4= '{' ( (lv_inputs_5_0= ruleInput ) ) (otherlv_6= ',' ( (lv_inputs_7_0= ruleInput ) ) )* otherlv_8= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==57) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalGithubaction.g:2589:4: otherlv_3= 'inputs' otherlv_4= '{' ( (lv_inputs_5_0= ruleInput ) ) (otherlv_6= ',' ( (lv_inputs_7_0= ruleInput ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getWorkflowDispatchEventAccess().getInputsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getWorkflowDispatchEventAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalGithubaction.g:2597:4: ( (lv_inputs_5_0= ruleInput ) )
                    // InternalGithubaction.g:2598:5: (lv_inputs_5_0= ruleInput )
                    {
                    // InternalGithubaction.g:2598:5: (lv_inputs_5_0= ruleInput )
                    // InternalGithubaction.g:2599:6: lv_inputs_5_0= ruleInput
                    {

                    						newCompositeNode(grammarAccess.getWorkflowDispatchEventAccess().getInputsInputParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_inputs_5_0=ruleInput();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkflowDispatchEventRule());
                    						}
                    						add(
                    							current,
                    							"inputs",
                    							lv_inputs_5_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.Input");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:2616:4: (otherlv_6= ',' ( (lv_inputs_7_0= ruleInput ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==14) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalGithubaction.g:2617:5: otherlv_6= ',' ( (lv_inputs_7_0= ruleInput ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getWorkflowDispatchEventAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalGithubaction.g:2621:5: ( (lv_inputs_7_0= ruleInput ) )
                    	    // InternalGithubaction.g:2622:6: (lv_inputs_7_0= ruleInput )
                    	    {
                    	    // InternalGithubaction.g:2622:6: (lv_inputs_7_0= ruleInput )
                    	    // InternalGithubaction.g:2623:7: lv_inputs_7_0= ruleInput
                    	    {

                    	    							newCompositeNode(grammarAccess.getWorkflowDispatchEventAccess().getInputsInputParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_inputs_7_0=ruleInput();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getWorkflowDispatchEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"inputs",
                    	    								lv_inputs_7_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.Input");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getWorkflowDispatchEventAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getWorkflowDispatchEventAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflowDispatchEvent"


    // $ANTLR start "entryRuleRepositoryDispatchEvent"
    // InternalGithubaction.g:2654:1: entryRuleRepositoryDispatchEvent returns [EObject current=null] : iv_ruleRepositoryDispatchEvent= ruleRepositoryDispatchEvent EOF ;
    public final EObject entryRuleRepositoryDispatchEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryDispatchEvent = null;


        try {
            // InternalGithubaction.g:2654:64: (iv_ruleRepositoryDispatchEvent= ruleRepositoryDispatchEvent EOF )
            // InternalGithubaction.g:2655:2: iv_ruleRepositoryDispatchEvent= ruleRepositoryDispatchEvent EOF
            {
             newCompositeNode(grammarAccess.getRepositoryDispatchEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepositoryDispatchEvent=ruleRepositoryDispatchEvent();

            state._fsp--;

             current =iv_ruleRepositoryDispatchEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepositoryDispatchEvent"


    // $ANTLR start "ruleRepositoryDispatchEvent"
    // InternalGithubaction.g:2661:1: ruleRepositoryDispatchEvent returns [EObject current=null] : ( () otherlv_1= 'RepositoryDispatchEvent' otherlv_2= '{' (otherlv_3= 'eventTypes' otherlv_4= '{' ( (lv_eventTypes_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_eventTypes_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleRepositoryDispatchEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_eventTypes_5_0 = null;

        AntlrDatatypeRuleToken lv_eventTypes_7_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:2667:2: ( ( () otherlv_1= 'RepositoryDispatchEvent' otherlv_2= '{' (otherlv_3= 'eventTypes' otherlv_4= '{' ( (lv_eventTypes_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_eventTypes_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalGithubaction.g:2668:2: ( () otherlv_1= 'RepositoryDispatchEvent' otherlv_2= '{' (otherlv_3= 'eventTypes' otherlv_4= '{' ( (lv_eventTypes_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_eventTypes_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalGithubaction.g:2668:2: ( () otherlv_1= 'RepositoryDispatchEvent' otherlv_2= '{' (otherlv_3= 'eventTypes' otherlv_4= '{' ( (lv_eventTypes_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_eventTypes_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalGithubaction.g:2669:3: () otherlv_1= 'RepositoryDispatchEvent' otherlv_2= '{' (otherlv_3= 'eventTypes' otherlv_4= '{' ( (lv_eventTypes_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_eventTypes_7_0= ruleEString ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalGithubaction.g:2669:3: ()
            // InternalGithubaction.g:2670:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryDispatchEventAccess().getRepositoryDispatchEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryDispatchEventAccess().getRepositoryDispatchEventKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryDispatchEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGithubaction.g:2684:3: (otherlv_3= 'eventTypes' otherlv_4= '{' ( (lv_eventTypes_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_eventTypes_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==59) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalGithubaction.g:2685:4: otherlv_3= 'eventTypes' otherlv_4= '{' ( (lv_eventTypes_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_eventTypes_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRepositoryDispatchEventAccess().getEventTypesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getRepositoryDispatchEventAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalGithubaction.g:2693:4: ( (lv_eventTypes_5_0= ruleEString ) )
                    // InternalGithubaction.g:2694:5: (lv_eventTypes_5_0= ruleEString )
                    {
                    // InternalGithubaction.g:2694:5: (lv_eventTypes_5_0= ruleEString )
                    // InternalGithubaction.g:2695:6: lv_eventTypes_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRepositoryDispatchEventAccess().getEventTypesEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_eventTypes_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryDispatchEventRule());
                    						}
                    						add(
                    							current,
                    							"eventTypes",
                    							lv_eventTypes_5_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:2712:4: (otherlv_6= ',' ( (lv_eventTypes_7_0= ruleEString ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==14) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalGithubaction.g:2713:5: otherlv_6= ',' ( (lv_eventTypes_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRepositoryDispatchEventAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalGithubaction.g:2717:5: ( (lv_eventTypes_7_0= ruleEString ) )
                    	    // InternalGithubaction.g:2718:6: (lv_eventTypes_7_0= ruleEString )
                    	    {
                    	    // InternalGithubaction.g:2718:6: (lv_eventTypes_7_0= ruleEString )
                    	    // InternalGithubaction.g:2719:7: lv_eventTypes_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryDispatchEventAccess().getEventTypesEStringParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_eventTypes_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryDispatchEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"eventTypes",
                    	    								lv_eventTypes_7_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getRepositoryDispatchEventAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRepositoryDispatchEventAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepositoryDispatchEvent"


    // $ANTLR start "entryRuleCreateEvent"
    // InternalGithubaction.g:2750:1: entryRuleCreateEvent returns [EObject current=null] : iv_ruleCreateEvent= ruleCreateEvent EOF ;
    public final EObject entryRuleCreateEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateEvent = null;


        try {
            // InternalGithubaction.g:2750:52: (iv_ruleCreateEvent= ruleCreateEvent EOF )
            // InternalGithubaction.g:2751:2: iv_ruleCreateEvent= ruleCreateEvent EOF
            {
             newCompositeNode(grammarAccess.getCreateEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreateEvent=ruleCreateEvent();

            state._fsp--;

             current =iv_ruleCreateEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateEvent"


    // $ANTLR start "ruleCreateEvent"
    // InternalGithubaction.g:2757:1: ruleCreateEvent returns [EObject current=null] : ( () otherlv_1= 'CreateEvent' ) ;
    public final EObject ruleCreateEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGithubaction.g:2763:2: ( ( () otherlv_1= 'CreateEvent' ) )
            // InternalGithubaction.g:2764:2: ( () otherlv_1= 'CreateEvent' )
            {
            // InternalGithubaction.g:2764:2: ( () otherlv_1= 'CreateEvent' )
            // InternalGithubaction.g:2765:3: () otherlv_1= 'CreateEvent'
            {
            // InternalGithubaction.g:2765:3: ()
            // InternalGithubaction.g:2766:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCreateEventAccess().getCreateEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCreateEventAccess().getCreateEventKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateEvent"


    // $ANTLR start "entryRuleDeleteEvent"
    // InternalGithubaction.g:2780:1: entryRuleDeleteEvent returns [EObject current=null] : iv_ruleDeleteEvent= ruleDeleteEvent EOF ;
    public final EObject entryRuleDeleteEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteEvent = null;


        try {
            // InternalGithubaction.g:2780:52: (iv_ruleDeleteEvent= ruleDeleteEvent EOF )
            // InternalGithubaction.g:2781:2: iv_ruleDeleteEvent= ruleDeleteEvent EOF
            {
             newCompositeNode(grammarAccess.getDeleteEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteEvent=ruleDeleteEvent();

            state._fsp--;

             current =iv_ruleDeleteEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteEvent"


    // $ANTLR start "ruleDeleteEvent"
    // InternalGithubaction.g:2787:1: ruleDeleteEvent returns [EObject current=null] : ( () otherlv_1= 'DeleteEvent' ) ;
    public final EObject ruleDeleteEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGithubaction.g:2793:2: ( ( () otherlv_1= 'DeleteEvent' ) )
            // InternalGithubaction.g:2794:2: ( () otherlv_1= 'DeleteEvent' )
            {
            // InternalGithubaction.g:2794:2: ( () otherlv_1= 'DeleteEvent' )
            // InternalGithubaction.g:2795:3: () otherlv_1= 'DeleteEvent'
            {
            // InternalGithubaction.g:2795:3: ()
            // InternalGithubaction.g:2796:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeleteEventAccess().getDeleteEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteEventAccess().getDeleteEventKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteEvent"


    // $ANTLR start "entryRuleDeploymentEvent"
    // InternalGithubaction.g:2810:1: entryRuleDeploymentEvent returns [EObject current=null] : iv_ruleDeploymentEvent= ruleDeploymentEvent EOF ;
    public final EObject entryRuleDeploymentEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeploymentEvent = null;


        try {
            // InternalGithubaction.g:2810:56: (iv_ruleDeploymentEvent= ruleDeploymentEvent EOF )
            // InternalGithubaction.g:2811:2: iv_ruleDeploymentEvent= ruleDeploymentEvent EOF
            {
             newCompositeNode(grammarAccess.getDeploymentEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeploymentEvent=ruleDeploymentEvent();

            state._fsp--;

             current =iv_ruleDeploymentEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeploymentEvent"


    // $ANTLR start "ruleDeploymentEvent"
    // InternalGithubaction.g:2817:1: ruleDeploymentEvent returns [EObject current=null] : ( () otherlv_1= 'DeploymentEvent' ) ;
    public final EObject ruleDeploymentEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalGithubaction.g:2823:2: ( ( () otherlv_1= 'DeploymentEvent' ) )
            // InternalGithubaction.g:2824:2: ( () otherlv_1= 'DeploymentEvent' )
            {
            // InternalGithubaction.g:2824:2: ( () otherlv_1= 'DeploymentEvent' )
            // InternalGithubaction.g:2825:3: () otherlv_1= 'DeploymentEvent'
            {
            // InternalGithubaction.g:2825:3: ()
            // InternalGithubaction.g:2826:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeploymentEventAccess().getDeploymentEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDeploymentEventAccess().getDeploymentEventKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeploymentEvent"


    // $ANTLR start "entryRuleIssueEvent"
    // InternalGithubaction.g:2840:1: entryRuleIssueEvent returns [EObject current=null] : iv_ruleIssueEvent= ruleIssueEvent EOF ;
    public final EObject entryRuleIssueEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIssueEvent = null;


        try {
            // InternalGithubaction.g:2840:51: (iv_ruleIssueEvent= ruleIssueEvent EOF )
            // InternalGithubaction.g:2841:2: iv_ruleIssueEvent= ruleIssueEvent EOF
            {
             newCompositeNode(grammarAccess.getIssueEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIssueEvent=ruleIssueEvent();

            state._fsp--;

             current =iv_ruleIssueEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIssueEvent"


    // $ANTLR start "ruleIssueEvent"
    // InternalGithubaction.g:2847:1: ruleIssueEvent returns [EObject current=null] : ( () otherlv_1= 'IssueEvent' otherlv_2= '{' (otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleIssueActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleIssueActivityType ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleIssueEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_activityTypes_5_0 = null;

        Enumerator lv_activityTypes_7_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:2853:2: ( ( () otherlv_1= 'IssueEvent' otherlv_2= '{' (otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleIssueActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleIssueActivityType ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalGithubaction.g:2854:2: ( () otherlv_1= 'IssueEvent' otherlv_2= '{' (otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleIssueActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleIssueActivityType ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalGithubaction.g:2854:2: ( () otherlv_1= 'IssueEvent' otherlv_2= '{' (otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleIssueActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleIssueActivityType ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalGithubaction.g:2855:3: () otherlv_1= 'IssueEvent' otherlv_2= '{' (otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleIssueActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleIssueActivityType ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalGithubaction.g:2855:3: ()
            // InternalGithubaction.g:2856:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIssueEventAccess().getIssueEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIssueEventAccess().getIssueEventKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getIssueEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGithubaction.g:2870:3: (otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleIssueActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleIssueActivityType ) ) )* otherlv_8= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==64) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalGithubaction.g:2871:4: otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleIssueActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleIssueActivityType ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getIssueEventAccess().getActivityTypesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_59); 

                    				newLeafNode(otherlv_4, grammarAccess.getIssueEventAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalGithubaction.g:2879:4: ( (lv_activityTypes_5_0= ruleIssueActivityType ) )
                    // InternalGithubaction.g:2880:5: (lv_activityTypes_5_0= ruleIssueActivityType )
                    {
                    // InternalGithubaction.g:2880:5: (lv_activityTypes_5_0= ruleIssueActivityType )
                    // InternalGithubaction.g:2881:6: lv_activityTypes_5_0= ruleIssueActivityType
                    {

                    						newCompositeNode(grammarAccess.getIssueEventAccess().getActivityTypesIssueActivityTypeEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_activityTypes_5_0=ruleIssueActivityType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIssueEventRule());
                    						}
                    						add(
                    							current,
                    							"activityTypes",
                    							lv_activityTypes_5_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.IssueActivityType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:2898:4: (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleIssueActivityType ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==14) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalGithubaction.g:2899:5: otherlv_6= ',' ( (lv_activityTypes_7_0= ruleIssueActivityType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_59); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getIssueEventAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalGithubaction.g:2903:5: ( (lv_activityTypes_7_0= ruleIssueActivityType ) )
                    	    // InternalGithubaction.g:2904:6: (lv_activityTypes_7_0= ruleIssueActivityType )
                    	    {
                    	    // InternalGithubaction.g:2904:6: (lv_activityTypes_7_0= ruleIssueActivityType )
                    	    // InternalGithubaction.g:2905:7: lv_activityTypes_7_0= ruleIssueActivityType
                    	    {

                    	    							newCompositeNode(grammarAccess.getIssueEventAccess().getActivityTypesIssueActivityTypeEnumRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_activityTypes_7_0=ruleIssueActivityType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getIssueEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activityTypes",
                    	    								lv_activityTypes_7_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.IssueActivityType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getIssueEventAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getIssueEventAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIssueEvent"


    // $ANTLR start "entryRuleLabelEvent"
    // InternalGithubaction.g:2936:1: entryRuleLabelEvent returns [EObject current=null] : iv_ruleLabelEvent= ruleLabelEvent EOF ;
    public final EObject entryRuleLabelEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelEvent = null;


        try {
            // InternalGithubaction.g:2936:51: (iv_ruleLabelEvent= ruleLabelEvent EOF )
            // InternalGithubaction.g:2937:2: iv_ruleLabelEvent= ruleLabelEvent EOF
            {
             newCompositeNode(grammarAccess.getLabelEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabelEvent=ruleLabelEvent();

            state._fsp--;

             current =iv_ruleLabelEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabelEvent"


    // $ANTLR start "ruleLabelEvent"
    // InternalGithubaction.g:2943:1: ruleLabelEvent returns [EObject current=null] : ( () otherlv_1= 'LabelEvent' otherlv_2= '{' (otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleLabelActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleLabelActivityType ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleLabelEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_activityTypes_5_0 = null;

        Enumerator lv_activityTypes_7_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:2949:2: ( ( () otherlv_1= 'LabelEvent' otherlv_2= '{' (otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleLabelActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleLabelActivityType ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalGithubaction.g:2950:2: ( () otherlv_1= 'LabelEvent' otherlv_2= '{' (otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleLabelActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleLabelActivityType ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalGithubaction.g:2950:2: ( () otherlv_1= 'LabelEvent' otherlv_2= '{' (otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleLabelActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleLabelActivityType ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalGithubaction.g:2951:3: () otherlv_1= 'LabelEvent' otherlv_2= '{' (otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleLabelActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleLabelActivityType ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalGithubaction.g:2951:3: ()
            // InternalGithubaction.g:2952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLabelEventAccess().getLabelEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelEventAccess().getLabelEventKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getLabelEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGithubaction.g:2966:3: (otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleLabelActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleLabelActivityType ) ) )* otherlv_8= '}' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==64) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalGithubaction.g:2967:4: otherlv_3= 'activityTypes' otherlv_4= '{' ( (lv_activityTypes_5_0= ruleLabelActivityType ) ) (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleLabelActivityType ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,64,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLabelEventAccess().getActivityTypesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_60); 

                    				newLeafNode(otherlv_4, grammarAccess.getLabelEventAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalGithubaction.g:2975:4: ( (lv_activityTypes_5_0= ruleLabelActivityType ) )
                    // InternalGithubaction.g:2976:5: (lv_activityTypes_5_0= ruleLabelActivityType )
                    {
                    // InternalGithubaction.g:2976:5: (lv_activityTypes_5_0= ruleLabelActivityType )
                    // InternalGithubaction.g:2977:6: lv_activityTypes_5_0= ruleLabelActivityType
                    {

                    						newCompositeNode(grammarAccess.getLabelEventAccess().getActivityTypesLabelActivityTypeEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_activityTypes_5_0=ruleLabelActivityType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLabelEventRule());
                    						}
                    						add(
                    							current,
                    							"activityTypes",
                    							lv_activityTypes_5_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.LabelActivityType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGithubaction.g:2994:4: (otherlv_6= ',' ( (lv_activityTypes_7_0= ruleLabelActivityType ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==14) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalGithubaction.g:2995:5: otherlv_6= ',' ( (lv_activityTypes_7_0= ruleLabelActivityType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_60); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getLabelEventAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalGithubaction.g:2999:5: ( (lv_activityTypes_7_0= ruleLabelActivityType ) )
                    	    // InternalGithubaction.g:3000:6: (lv_activityTypes_7_0= ruleLabelActivityType )
                    	    {
                    	    // InternalGithubaction.g:3000:6: (lv_activityTypes_7_0= ruleLabelActivityType )
                    	    // InternalGithubaction.g:3001:7: lv_activityTypes_7_0= ruleLabelActivityType
                    	    {

                    	    							newCompositeNode(grammarAccess.getLabelEventAccess().getActivityTypesLabelActivityTypeEnumRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_activityTypes_7_0=ruleLabelActivityType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLabelEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activityTypes",
                    	    								lv_activityTypes_7_0,
                    	    								"uk.ac.kcl.inf.mdd.project.Githubaction.LabelActivityType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getLabelEventAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLabelEventAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelEvent"


    // $ANTLR start "entryRuleInput"
    // InternalGithubaction.g:3032:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalGithubaction.g:3032:46: (iv_ruleInput= ruleInput EOF )
            // InternalGithubaction.g:3033:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalGithubaction.g:3039:1: ruleInput returns [EObject current=null] : ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Input' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_required_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_default_8_0 = null;



        	enterRule();

        try {
            // InternalGithubaction.g:3045:2: ( ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Input' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) ) )? otherlv_9= '}' ) )
            // InternalGithubaction.g:3046:2: ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Input' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) ) )? otherlv_9= '}' )
            {
            // InternalGithubaction.g:3046:2: ( () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Input' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) ) )? otherlv_9= '}' )
            // InternalGithubaction.g:3047:3: () ( (lv_required_1_0= 'required' ) )? otherlv_2= 'Input' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )? (otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) ) )? otherlv_9= '}'
            {
            // InternalGithubaction.g:3047:3: ()
            // InternalGithubaction.g:3048:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            // InternalGithubaction.g:3054:3: ( (lv_required_1_0= 'required' ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==66) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalGithubaction.g:3055:4: (lv_required_1_0= 'required' )
                    {
                    // InternalGithubaction.g:3055:4: (lv_required_1_0= 'required' )
                    // InternalGithubaction.g:3056:5: lv_required_1_0= 'required'
                    {
                    lv_required_1_0=(Token)match(input,66,FOLLOW_61); 

                    					newLeafNode(lv_required_1_0, grammarAccess.getInputAccess().getRequiredRequiredKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInputRule());
                    					}
                    					setWithLastConsumed(current, "required", true, "required");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,67,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getInputAccess().getInputKeyword_2());
            		
            // InternalGithubaction.g:3072:3: ( (lv_name_3_0= ruleEString ) )
            // InternalGithubaction.g:3073:4: (lv_name_3_0= ruleEString )
            {
            // InternalGithubaction.g:3073:4: (lv_name_3_0= ruleEString )
            // InternalGithubaction.g:3074:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_4, grammarAccess.getInputAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalGithubaction.g:3095:3: (otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==68) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalGithubaction.g:3096:4: otherlv_5= 'description' ( (lv_description_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,68,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getInputAccess().getDescriptionKeyword_5_0());
                    			
                    // InternalGithubaction.g:3100:4: ( (lv_description_6_0= ruleEString ) )
                    // InternalGithubaction.g:3101:5: (lv_description_6_0= ruleEString )
                    {
                    // InternalGithubaction.g:3101:5: (lv_description_6_0= ruleEString )
                    // InternalGithubaction.g:3102:6: lv_description_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputAccess().getDescriptionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_63);
                    lv_description_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_6_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalGithubaction.g:3120:3: (otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==69) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalGithubaction.g:3121:4: otherlv_7= 'default' ( (lv_default_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,69,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getInputAccess().getDefaultKeyword_6_0());
                    			
                    // InternalGithubaction.g:3125:4: ( (lv_default_8_0= ruleEString ) )
                    // InternalGithubaction.g:3126:5: (lv_default_8_0= ruleEString )
                    {
                    // InternalGithubaction.g:3126:5: (lv_default_8_0= ruleEString )
                    // InternalGithubaction.g:3127:6: lv_default_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getInputAccess().getDefaultEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getInputRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_8_0,
                    							"uk.ac.kcl.inf.mdd.project.Githubaction.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getInputAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleEString"
    // InternalGithubaction.g:3153:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGithubaction.g:3153:47: (iv_ruleEString= ruleEString EOF )
            // InternalGithubaction.g:3154:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalGithubaction.g:3160:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGithubaction.g:3166:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGithubaction.g:3167:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGithubaction.g:3167:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_STRING) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_ID) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalGithubaction.g:3168:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGithubaction.g:3176:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleIssueActivityType"
    // InternalGithubaction.g:3187:1: ruleIssueActivityType returns [Enumerator current=null] : ( (enumLiteral_0= 'opened' ) | (enumLiteral_1= 'edited' ) | (enumLiteral_2= 'deleted' ) | (enumLiteral_3= 'transferred' ) | (enumLiteral_4= 'pinned' ) | (enumLiteral_5= 'unpinned' ) | (enumLiteral_6= 'closed' ) | (enumLiteral_7= 'reopened' ) | (enumLiteral_8= 'assigned' ) | (enumLiteral_9= 'unassigned' ) | (enumLiteral_10= 'labeled' ) | (enumLiteral_11= 'unlabeled' ) | (enumLiteral_12= 'locked' ) | (enumLiteral_13= 'unlocked' ) | (enumLiteral_14= 'milestoned' ) | (enumLiteral_15= 'demilestoned' ) ) ;
    public final Enumerator ruleIssueActivityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;


        	enterRule();

        try {
            // InternalGithubaction.g:3193:2: ( ( (enumLiteral_0= 'opened' ) | (enumLiteral_1= 'edited' ) | (enumLiteral_2= 'deleted' ) | (enumLiteral_3= 'transferred' ) | (enumLiteral_4= 'pinned' ) | (enumLiteral_5= 'unpinned' ) | (enumLiteral_6= 'closed' ) | (enumLiteral_7= 'reopened' ) | (enumLiteral_8= 'assigned' ) | (enumLiteral_9= 'unassigned' ) | (enumLiteral_10= 'labeled' ) | (enumLiteral_11= 'unlabeled' ) | (enumLiteral_12= 'locked' ) | (enumLiteral_13= 'unlocked' ) | (enumLiteral_14= 'milestoned' ) | (enumLiteral_15= 'demilestoned' ) ) )
            // InternalGithubaction.g:3194:2: ( (enumLiteral_0= 'opened' ) | (enumLiteral_1= 'edited' ) | (enumLiteral_2= 'deleted' ) | (enumLiteral_3= 'transferred' ) | (enumLiteral_4= 'pinned' ) | (enumLiteral_5= 'unpinned' ) | (enumLiteral_6= 'closed' ) | (enumLiteral_7= 'reopened' ) | (enumLiteral_8= 'assigned' ) | (enumLiteral_9= 'unassigned' ) | (enumLiteral_10= 'labeled' ) | (enumLiteral_11= 'unlabeled' ) | (enumLiteral_12= 'locked' ) | (enumLiteral_13= 'unlocked' ) | (enumLiteral_14= 'milestoned' ) | (enumLiteral_15= 'demilestoned' ) )
            {
            // InternalGithubaction.g:3194:2: ( (enumLiteral_0= 'opened' ) | (enumLiteral_1= 'edited' ) | (enumLiteral_2= 'deleted' ) | (enumLiteral_3= 'transferred' ) | (enumLiteral_4= 'pinned' ) | (enumLiteral_5= 'unpinned' ) | (enumLiteral_6= 'closed' ) | (enumLiteral_7= 'reopened' ) | (enumLiteral_8= 'assigned' ) | (enumLiteral_9= 'unassigned' ) | (enumLiteral_10= 'labeled' ) | (enumLiteral_11= 'unlabeled' ) | (enumLiteral_12= 'locked' ) | (enumLiteral_13= 'unlocked' ) | (enumLiteral_14= 'milestoned' ) | (enumLiteral_15= 'demilestoned' ) )
            int alt84=16;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt84=1;
                }
                break;
            case 71:
                {
                alt84=2;
                }
                break;
            case 72:
                {
                alt84=3;
                }
                break;
            case 73:
                {
                alt84=4;
                }
                break;
            case 74:
                {
                alt84=5;
                }
                break;
            case 75:
                {
                alt84=6;
                }
                break;
            case 76:
                {
                alt84=7;
                }
                break;
            case 77:
                {
                alt84=8;
                }
                break;
            case 78:
                {
                alt84=9;
                }
                break;
            case 79:
                {
                alt84=10;
                }
                break;
            case 80:
                {
                alt84=11;
                }
                break;
            case 81:
                {
                alt84=12;
                }
                break;
            case 82:
                {
                alt84=13;
                }
                break;
            case 83:
                {
                alt84=14;
                }
                break;
            case 84:
                {
                alt84=15;
                }
                break;
            case 85:
                {
                alt84=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalGithubaction.g:3195:3: (enumLiteral_0= 'opened' )
                    {
                    // InternalGithubaction.g:3195:3: (enumLiteral_0= 'opened' )
                    // InternalGithubaction.g:3196:4: enumLiteral_0= 'opened'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getOpenedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIssueActivityTypeAccess().getOpenedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubaction.g:3203:3: (enumLiteral_1= 'edited' )
                    {
                    // InternalGithubaction.g:3203:3: (enumLiteral_1= 'edited' )
                    // InternalGithubaction.g:3204:4: enumLiteral_1= 'edited'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getEditedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIssueActivityTypeAccess().getEditedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGithubaction.g:3211:3: (enumLiteral_2= 'deleted' )
                    {
                    // InternalGithubaction.g:3211:3: (enumLiteral_2= 'deleted' )
                    // InternalGithubaction.g:3212:4: enumLiteral_2= 'deleted'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getDeletedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIssueActivityTypeAccess().getDeletedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGithubaction.g:3219:3: (enumLiteral_3= 'transferred' )
                    {
                    // InternalGithubaction.g:3219:3: (enumLiteral_3= 'transferred' )
                    // InternalGithubaction.g:3220:4: enumLiteral_3= 'transferred'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getTransferredEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getIssueActivityTypeAccess().getTransferredEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalGithubaction.g:3227:3: (enumLiteral_4= 'pinned' )
                    {
                    // InternalGithubaction.g:3227:3: (enumLiteral_4= 'pinned' )
                    // InternalGithubaction.g:3228:4: enumLiteral_4= 'pinned'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getPinnedEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getIssueActivityTypeAccess().getPinnedEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalGithubaction.g:3235:3: (enumLiteral_5= 'unpinned' )
                    {
                    // InternalGithubaction.g:3235:3: (enumLiteral_5= 'unpinned' )
                    // InternalGithubaction.g:3236:4: enumLiteral_5= 'unpinned'
                    {
                    enumLiteral_5=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getUnpinnedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getIssueActivityTypeAccess().getUnpinnedEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalGithubaction.g:3243:3: (enumLiteral_6= 'closed' )
                    {
                    // InternalGithubaction.g:3243:3: (enumLiteral_6= 'closed' )
                    // InternalGithubaction.g:3244:4: enumLiteral_6= 'closed'
                    {
                    enumLiteral_6=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getClosedEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getIssueActivityTypeAccess().getClosedEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalGithubaction.g:3251:3: (enumLiteral_7= 'reopened' )
                    {
                    // InternalGithubaction.g:3251:3: (enumLiteral_7= 'reopened' )
                    // InternalGithubaction.g:3252:4: enumLiteral_7= 'reopened'
                    {
                    enumLiteral_7=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getReopenedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getIssueActivityTypeAccess().getReopenedEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalGithubaction.g:3259:3: (enumLiteral_8= 'assigned' )
                    {
                    // InternalGithubaction.g:3259:3: (enumLiteral_8= 'assigned' )
                    // InternalGithubaction.g:3260:4: enumLiteral_8= 'assigned'
                    {
                    enumLiteral_8=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getAssignedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getIssueActivityTypeAccess().getAssignedEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalGithubaction.g:3267:3: (enumLiteral_9= 'unassigned' )
                    {
                    // InternalGithubaction.g:3267:3: (enumLiteral_9= 'unassigned' )
                    // InternalGithubaction.g:3268:4: enumLiteral_9= 'unassigned'
                    {
                    enumLiteral_9=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getUnassignedEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getIssueActivityTypeAccess().getUnassignedEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalGithubaction.g:3275:3: (enumLiteral_10= 'labeled' )
                    {
                    // InternalGithubaction.g:3275:3: (enumLiteral_10= 'labeled' )
                    // InternalGithubaction.g:3276:4: enumLiteral_10= 'labeled'
                    {
                    enumLiteral_10=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getLabeledEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getIssueActivityTypeAccess().getLabeledEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalGithubaction.g:3283:3: (enumLiteral_11= 'unlabeled' )
                    {
                    // InternalGithubaction.g:3283:3: (enumLiteral_11= 'unlabeled' )
                    // InternalGithubaction.g:3284:4: enumLiteral_11= 'unlabeled'
                    {
                    enumLiteral_11=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getUnlabeledEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getIssueActivityTypeAccess().getUnlabeledEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalGithubaction.g:3291:3: (enumLiteral_12= 'locked' )
                    {
                    // InternalGithubaction.g:3291:3: (enumLiteral_12= 'locked' )
                    // InternalGithubaction.g:3292:4: enumLiteral_12= 'locked'
                    {
                    enumLiteral_12=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getLockedEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getIssueActivityTypeAccess().getLockedEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalGithubaction.g:3299:3: (enumLiteral_13= 'unlocked' )
                    {
                    // InternalGithubaction.g:3299:3: (enumLiteral_13= 'unlocked' )
                    // InternalGithubaction.g:3300:4: enumLiteral_13= 'unlocked'
                    {
                    enumLiteral_13=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getUnlockedEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getIssueActivityTypeAccess().getUnlockedEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalGithubaction.g:3307:3: (enumLiteral_14= 'milestoned' )
                    {
                    // InternalGithubaction.g:3307:3: (enumLiteral_14= 'milestoned' )
                    // InternalGithubaction.g:3308:4: enumLiteral_14= 'milestoned'
                    {
                    enumLiteral_14=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getMilestonedEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getIssueActivityTypeAccess().getMilestonedEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalGithubaction.g:3315:3: (enumLiteral_15= 'demilestoned' )
                    {
                    // InternalGithubaction.g:3315:3: (enumLiteral_15= 'demilestoned' )
                    // InternalGithubaction.g:3316:4: enumLiteral_15= 'demilestoned'
                    {
                    enumLiteral_15=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getIssueActivityTypeAccess().getDemilestonedEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getIssueActivityTypeAccess().getDemilestonedEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIssueActivityType"


    // $ANTLR start "ruleLabelActivityType"
    // InternalGithubaction.g:3326:1: ruleLabelActivityType returns [Enumerator current=null] : ( (enumLiteral_0= 'created' ) | (enumLiteral_1= 'edited' ) | (enumLiteral_2= 'deleted' ) ) ;
    public final Enumerator ruleLabelActivityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalGithubaction.g:3332:2: ( ( (enumLiteral_0= 'created' ) | (enumLiteral_1= 'edited' ) | (enumLiteral_2= 'deleted' ) ) )
            // InternalGithubaction.g:3333:2: ( (enumLiteral_0= 'created' ) | (enumLiteral_1= 'edited' ) | (enumLiteral_2= 'deleted' ) )
            {
            // InternalGithubaction.g:3333:2: ( (enumLiteral_0= 'created' ) | (enumLiteral_1= 'edited' ) | (enumLiteral_2= 'deleted' ) )
            int alt85=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt85=1;
                }
                break;
            case 71:
                {
                alt85=2;
                }
                break;
            case 72:
                {
                alt85=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalGithubaction.g:3334:3: (enumLiteral_0= 'created' )
                    {
                    // InternalGithubaction.g:3334:3: (enumLiteral_0= 'created' )
                    // InternalGithubaction.g:3335:4: enumLiteral_0= 'created'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getLabelActivityTypeAccess().getCreatedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLabelActivityTypeAccess().getCreatedEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGithubaction.g:3342:3: (enumLiteral_1= 'edited' )
                    {
                    // InternalGithubaction.g:3342:3: (enumLiteral_1= 'edited' )
                    // InternalGithubaction.g:3343:4: enumLiteral_1= 'edited'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getLabelActivityTypeAccess().getEditedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLabelActivityTypeAccess().getEditedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGithubaction.g:3350:3: (enumLiteral_2= 'deleted' )
                    {
                    // InternalGithubaction.g:3350:3: (enumLiteral_2= 'deleted' )
                    // InternalGithubaction.g:3351:4: enumLiteral_2= 'deleted'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getLabelActivityTypeAccess().getDeletedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLabelActivityTypeAccess().getDeletedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabelActivityType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000003E8000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003C8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xF506040000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000388000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000308000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000007C9A8000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000007C988000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000007C188000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000078188000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000070188000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060188000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000060108000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000060008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003F200A8000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000003F20088000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000003F00088000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000003E00088000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003C00088000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000003800088000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000003000088000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000088000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000030800008000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020800008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001F80000008000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001F00000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001E00000008000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001C00000008000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001800000008000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00F8000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00F0000000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00E0000000008000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00C0000000008000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0080000000008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0200000000008000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0800000000008000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000001L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x00000000003FFFC0L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400180L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000030L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000020L});

}