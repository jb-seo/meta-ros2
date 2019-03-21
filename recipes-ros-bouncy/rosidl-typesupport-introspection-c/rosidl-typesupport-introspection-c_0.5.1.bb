# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the message type support for dynamic message construction in C."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rosidl-cmake rosidl-generator-c rosidl-parser"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/bouncy/rosidl_typesupport_introspection_c/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5164d5e21e11d7bd048cc16fd33d7b52"
SRC_URI[sha256sum] = "16162f0ec85f7831c42c950003d0febd9c89542a6746467a2dc80ed4ad024ac7"
S = "${WORKDIR}/rosidl-release-release-bouncy-rosidl_typesupport_introspection_c-0.5.1-0"

inherit ros
inherit ament


