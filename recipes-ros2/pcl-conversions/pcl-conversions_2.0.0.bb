# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides conversions from PCL data types and ROS message types"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " builtin-interfaces eigen libpcl-all-dev sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros2-gbp/pcl_conversions-release/archive/release/crystal/pcl_conversions/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9bbc58df44c99d29b6836e64301642a8"
SRC_URI[sha256sum] = "10639c7bb949fbb1640fa0c27d8e4d3a98c05ce8d896314a9d68551b9d476c55"
S = "${WORKDIR}/pcl_conversions-release-release-crystal-pcl_conversions-2.0.0-0"

inherit ament
