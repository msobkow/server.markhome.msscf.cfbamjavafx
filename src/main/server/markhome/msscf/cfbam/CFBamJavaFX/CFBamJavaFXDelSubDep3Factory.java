// Description: Java 11 JavaFX Display Element Factory for DelSubDep3.

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
 *	CFBamJavaFXDelSubDep3Factory JavaFX Display Element Factory
 *	for DelSubDep3.
 */
public class CFBamJavaFXDelSubDep3Factory
implements ICFBamJavaFXDelSubDep3Factory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXDelSubDep3Factory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDelSubDep3Obj argFocus ) {
		CFBamJavaFXDelSubDep3AttrPane retnew = new CFBamJavaFXDelSubDep3AttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamDelSubDep2Obj argContainer,
		ICFBamDelSubDep3Obj argFocus,
		Collection<ICFBamDelSubDep3Obj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXDelSubDep3ListPane retnew = new CFBamJavaFXDelSubDep3ListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDelSubDep3Obj argFocus,
		ICFBamDelSubDep2Obj argContainer,
		Collection<ICFBamDelSubDep3Obj> argDataCollection,
		ICFBamJavaFXDelSubDep3Chosen whenChosen )
	{
		CFBamJavaFXDelSubDep3PickerPane retnew = new CFBamJavaFXDelSubDep3PickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamDelSubDep3Obj argFocus ) {
		CFBamJavaFXDelSubDep3EltTabPane retnew = new CFBamJavaFXDelSubDep3EltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamDelSubDep3Obj argFocus ) {
		CFBamJavaFXDelSubDep3AddPane retnew = new CFBamJavaFXDelSubDep3AddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamDelSubDep3Obj argFocus ) {
		CFBamJavaFXDelSubDep3ViewEditPane retnew = new CFBamJavaFXDelSubDep3ViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDelSubDep3Obj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXDelSubDep3AskDeleteForm retnew = new CFBamJavaFXDelSubDep3AskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDelSubDep3Obj argFocus,
		ICFBamDelSubDep2Obj argContainer,
		Collection<ICFBamDelSubDep3Obj> argDataCollection,
		ICFBamJavaFXDelSubDep3Chosen whenChosen )
	{
		CFBamJavaFXDelSubDep3PickerForm retnew = new CFBamJavaFXDelSubDep3PickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDelSubDep3Obj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXDelSubDep3AddForm retnew = new CFBamJavaFXDelSubDep3AddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDelSubDep3Obj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXDelSubDep3ViewEditForm retnew = new CFBamJavaFXDelSubDep3ViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
