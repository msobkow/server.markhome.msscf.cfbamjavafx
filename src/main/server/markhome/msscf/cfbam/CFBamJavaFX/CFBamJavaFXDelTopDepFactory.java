// Description: Java 11 JavaFX Display Element Factory for DelTopDep.

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
 *	CFBamJavaFXDelTopDepFactory JavaFX Display Element Factory
 *	for DelTopDep.
 */
public class CFBamJavaFXDelTopDepFactory
implements ICFBamJavaFXDelTopDepFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXDelTopDepFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDelTopDepObj argFocus ) {
		CFBamJavaFXDelTopDepAttrPane retnew = new CFBamJavaFXDelTopDepAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamDelTopDepObj argFocus,
		Collection<ICFBamDelTopDepObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXDelTopDepListPane retnew = new CFBamJavaFXDelTopDepListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDelTopDepObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamDelTopDepObj> argDataCollection,
		ICFBamJavaFXDelTopDepChosen whenChosen )
	{
		CFBamJavaFXDelTopDepPickerPane retnew = new CFBamJavaFXDelTopDepPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamDelTopDepObj argFocus ) {
		CFBamJavaFXDelTopDepEltTabPane retnew = new CFBamJavaFXDelTopDepEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamDelTopDepObj argFocus ) {
		CFBamJavaFXDelTopDepAddPane retnew = new CFBamJavaFXDelTopDepAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamDelTopDepObj argFocus ) {
		CFBamJavaFXDelTopDepViewEditPane retnew = new CFBamJavaFXDelTopDepViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDelTopDepObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXDelTopDepAskDeleteForm retnew = new CFBamJavaFXDelTopDepAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDelTopDepObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamDelTopDepObj> argDataCollection,
		ICFBamJavaFXDelTopDepChosen whenChosen )
	{
		CFBamJavaFXDelTopDepPickerForm retnew = new CFBamJavaFXDelTopDepPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDelTopDepObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXDelTopDepAddForm retnew = new CFBamJavaFXDelTopDepAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDelTopDepObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXDelTopDepViewEditForm retnew = new CFBamJavaFXDelTopDepViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
