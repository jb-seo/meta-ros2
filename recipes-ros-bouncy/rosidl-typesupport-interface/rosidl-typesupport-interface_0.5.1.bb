# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The interface for rosidl typesupport packages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/bouncy/rosidl_typesupport_interface/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "807938830f106e848390f8cb71926026"
SRC_URI[sha256sum] = "4b8ba16377f41780cbeeaf41fe41b1cc5e9ff7b77095421b7650d2626420cf35"
S = "${WORKDIR}/rosidl-release-release-bouncy-rosidl_typesupport_interface-0.5.1-0"

inherit ros
inherit ament


