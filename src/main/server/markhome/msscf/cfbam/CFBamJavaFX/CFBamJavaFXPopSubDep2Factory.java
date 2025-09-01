// Description: Java 11 JavaFX Display Element Factory for PopSubDep2.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	CFBamJavaFXPopSubDep2Factory JavaFX Display Element Factory
 *	for PopSubDep2.
 */
public class CFBamJavaFXPopSubDep2Factory
implements ICFBamJavaFXPopSubDep2Factory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXPopSubDep2Factory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamPopSubDep2Obj argFocus ) {
		CFBamJavaFXPopSubDep2AttrPane retnew = new CFBamJavaFXPopSubDep2AttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamPopSubDep1Obj argContainer,
		ICFBamPopSubDep2Obj argFocus,
		Collection<ICFBamPopSubDep2Obj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXPopSubDep2ListPane retnew = new CFBamJavaFXPopSubDep2ListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamPopSubDep2Obj argFocus,
		ICFBamPopSubDep1Obj argContainer,
		Collection<ICFBamPopSubDep2Obj> argDataCollection,
		ICFBamJavaFXPopSubDep2Chosen whenChosen )
	{
		CFBamJavaFXPopSubDep2PickerPane retnew = new CFBamJavaFXPopSubDep2PickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamPopSubDep2Obj argFocus ) {
		CFBamJavaFXPopSubDep2EltTabPane retnew = new CFBamJavaFXPopSubDep2EltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamPopSubDep2Obj argFocus ) {
		CFBamJavaFXPopSubDep2AddPane retnew = new CFBamJavaFXPopSubDep2AddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamPopSubDep2Obj argFocus ) {
		CFBamJavaFXPopSubDep2ViewEditPane retnew = new CFBamJavaFXPopSubDep2ViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamPopSubDep2Obj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXPopSubDep2AskDeleteForm retnew = new CFBamJavaFXPopSubDep2AskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamPopSubDep2Obj argFocus,
		ICFBamPopSubDep1Obj argContainer,
		Collection<ICFBamPopSubDep2Obj> argDataCollection,
		ICFBamJavaFXPopSubDep2Chosen whenChosen )
	{
		CFBamJavaFXPopSubDep2PickerForm retnew = new CFBamJavaFXPopSubDep2PickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamPopSubDep2Obj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXPopSubDep2AddForm retnew = new CFBamJavaFXPopSubDep2AddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamPopSubDep2Obj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXPopSubDep2ViewEditForm retnew = new CFBamJavaFXPopSubDep2ViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
