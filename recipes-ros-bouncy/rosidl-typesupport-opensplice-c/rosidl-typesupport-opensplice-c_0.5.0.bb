# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the C interfaces for PrismTech OpenSplice."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake libopensplice67 opensplice-cmake-module rmw rosidl-cmake rosidl-generator-c rosidl-parser rosidl-typesupport-opensplice-cpp"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_opensplice-release/archive/release/bouncy/rosidl_typesupport_opensplice_c/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dd9ace7a3a9efba6fcb4d4f5d2b8ecd2"
SRC_URI[sha256sum] = "a8e57bc2aa75bbbc98765c77fa8d0d31257973c1b237f664d7981d6741e5bde6"
S = "${WORKDIR}/rosidl_typesupport_opensplice-release-release-bouncy-rosidl_typesupport_opensplice_c-0.5.0-0"

inherit catkin
