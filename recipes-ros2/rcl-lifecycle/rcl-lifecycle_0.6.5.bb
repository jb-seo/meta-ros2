# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing a C-based lifecycle implementation"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " lifecycle-msgs rcl rcutils rmw-implementation rosidl-generator-c"
SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/crystal/rcl_lifecycle/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "293f2a82f5d74b414147ecca03e72f18"
SRC_URI[sha256sum] = "63726fad34ad41271afe9159bec525754fccbb6510a32bb7658dd066945c5a08"
S = "${WORKDIR}/rcl-release-release-crystal-rcl_lifecycle-0.6.5-0"

inherit ament
