# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some standard message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "builtin-interfaces rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/std_msgs/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7383edaa591e6184dc719224bf6e4172"
SRC_URI[sha256sum] = "2667ca94543f46471c4350400c0eea01ed8ef13a38b04bb65a67a0fb35afafae"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-std_msgs-0.5.1-0"


inherit ros
inherit ament
inherit pythonpath-insane

