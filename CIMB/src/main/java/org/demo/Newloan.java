package org.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Newloan implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.Float loanamount;
   private java.lang.String duration;
   private java.lang.String reason;
   private java.lang.Float interest;
   private java.lang.String remarks;

   public Newloan()
   {
   }

   public java.lang.Float getLoanamount()
   {
      return this.loanamount;
   }

   public void setLoanamount(java.lang.Float loanamount)
   {
      this.loanamount = loanamount;
   }

   public java.lang.String getDuration()
   {
      return this.duration;
   }

   public void setDuration(java.lang.String duration)
   {
      this.duration = duration;
   }

   public java.lang.String getReason()
   {
      return this.reason;
   }

   public void setReason(java.lang.String reason)
   {
      this.reason = reason;
   }

   public java.lang.Float getInterest()
   {
      return this.interest;
   }

   public void setInterest(java.lang.Float interest)
   {
      this.interest = interest;
   }

   public java.lang.String getRemarks()
   {
      return this.remarks;
   }

   public void setRemarks(java.lang.String remarks)
   {
      this.remarks = remarks;
   }

   public Newloan(java.lang.Float loanamount, java.lang.String duration,
         java.lang.String reason, java.lang.Float interest,
         java.lang.String remarks)
   {
      this.loanamount = loanamount;
      this.duration = duration;
      this.reason = reason;
      this.interest = interest;
      this.remarks = remarks;
   }

}