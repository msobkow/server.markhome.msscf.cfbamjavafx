// Description: Java 11 JavaFX Display Element Factory for PopTopDep.

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
 *	CFBamJavaFXPopTopDepFactory JavaFX Display Element Factory
 *	for PopTopDep.
 */
public class CFBamJavaFXPopTopDepFactory
implements ICFBamJavaFXPopTopDepFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXPopTopDepFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamPopTopDepObj argFocus ) {
		CFBamJavaFXPopTopDepAttrPane retnew = new CFBamJavaFXPopTopDepAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamRelationObj argContainer,
		ICFBamPopTopDepObj argFocus,
		Collection<ICFBamPopTopDepObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXPopTopDepListPane retnew = new CFBamJavaFXPopTopDepListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamPopTopDepObj argFocus,
		ICFBamRelationObj argContainer,
		Collection<ICFBamPopTopDepObj> argDataCollection,
		ICFBamJavaFXPopTopDepChosen whenChosen )
	{
		CFBamJavaFXPopTopDepPickerPane retnew = new CFBamJavaFXPopTopDepPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamPopTopDepObj argFocus ) {
		CFBamJavaFXPopTopDepEltTabPane retnew = new CFBamJavaFXPopTopDepEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamPopTopDepObj argFocus ) {
		CFBamJavaFXPopTopDepAddPane retnew = new CFBamJavaFXPopTopDepAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamPopTopDepObj argFocus ) {
		CFBamJavaFXPopTopDepViewEditPane retnew = new CFBamJavaFXPopTopDepViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamPopTopDepObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXPopTopDepAskDeleteForm retnew = new CFBamJavaFXPopTopDepAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamPopTopDepObj argFocus,
		ICFBamRelationObj argContainer,
		Collection<ICFBamPopTopDepObj> argDataCollection,
		ICFBamJavaFXPopTopDepChosen whenChosen )
	{
		CFBamJavaFXPopTopDepPickerForm retnew = new CFBamJavaFXPopTopDepPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamPopTopDepObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXPopTopDepAddForm retnew = new CFBamJavaFXPopTopDepAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamPopTopDepObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXPopTopDepViewEditForm retnew = new CFBamJavaFXPopTopDepViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
