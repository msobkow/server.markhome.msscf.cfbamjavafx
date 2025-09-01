// Description: Java 11 JavaFX Display Element Factory for ClearSubDep3.

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
 *	CFBamJavaFXClearSubDep3Factory JavaFX Display Element Factory
 *	for ClearSubDep3.
 */
public class CFBamJavaFXClearSubDep3Factory
implements ICFBamJavaFXClearSubDep3Factory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXClearSubDep3Factory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamClearSubDep3Obj argFocus ) {
		CFBamJavaFXClearSubDep3AttrPane retnew = new CFBamJavaFXClearSubDep3AttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamClearSubDep2Obj argContainer,
		ICFBamClearSubDep3Obj argFocus,
		Collection<ICFBamClearSubDep3Obj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXClearSubDep3ListPane retnew = new CFBamJavaFXClearSubDep3ListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamClearSubDep3Obj argFocus,
		ICFBamClearSubDep2Obj argContainer,
		Collection<ICFBamClearSubDep3Obj> argDataCollection,
		ICFBamJavaFXClearSubDep3Chosen whenChosen )
	{
		CFBamJavaFXClearSubDep3PickerPane retnew = new CFBamJavaFXClearSubDep3PickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamClearSubDep3Obj argFocus ) {
		CFBamJavaFXClearSubDep3EltTabPane retnew = new CFBamJavaFXClearSubDep3EltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamClearSubDep3Obj argFocus ) {
		CFBamJavaFXClearSubDep3AddPane retnew = new CFBamJavaFXClearSubDep3AddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamClearSubDep3Obj argFocus ) {
		CFBamJavaFXClearSubDep3ViewEditPane retnew = new CFBamJavaFXClearSubDep3ViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamClearSubDep3Obj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXClearSubDep3AskDeleteForm retnew = new CFBamJavaFXClearSubDep3AskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamClearSubDep3Obj argFocus,
		ICFBamClearSubDep2Obj argContainer,
		Collection<ICFBamClearSubDep3Obj> argDataCollection,
		ICFBamJavaFXClearSubDep3Chosen whenChosen )
	{
		CFBamJavaFXClearSubDep3PickerForm retnew = new CFBamJavaFXClearSubDep3PickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamClearSubDep3Obj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXClearSubDep3AddForm retnew = new CFBamJavaFXClearSubDep3AddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamClearSubDep3Obj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXClearSubDep3ViewEditForm retnew = new CFBamJavaFXClearSubDep3ViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
