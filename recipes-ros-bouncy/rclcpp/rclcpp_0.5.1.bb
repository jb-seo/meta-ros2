# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS client library in C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "builtin-interfaces rcl rcl-interfaces rcl-yaml-param-parser rmw rmw-implementation rosgraph-msgs rosidl-generator-cpp rosidl-typesupport-c rosidl-typesupport-cpp"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "153208adb856975cd84997f9f5c33cae"
SRC_URI[sha256sum] = "b6cb705cee29cb8a27eda4f099a6019c2d929a8e528a771721a1c24956aee51d"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-0.5.1-0"


inherit ros
inherit ament

