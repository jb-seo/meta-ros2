# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS messages for universally unique identifiers."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/unique_identifier_msgs-release/archive/release/crystal/unique_identifier_msgs/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7f33e2f814062f22b40c70b9d44d04c8"
SRC_URI[sha256sum] = "87eed67a35931d8ae852ed650b8b98049ee7af773fa97ba29ab0f0d42b5f3636"
S = "${WORKDIR}/unique_identifier_msgs-release-release-crystal-unique_identifier_msgs-2.0.0-0"

inherit ament pythonpath-insane
