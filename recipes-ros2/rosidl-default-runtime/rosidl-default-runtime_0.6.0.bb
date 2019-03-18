# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A configuration package defining the runtime for the ROS interfaces."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rosidl-generator-cpp rosidl-generator-py rosidl-typesupport-c rosidl-typesupport-cpp rosidl-typesupport-introspection-c rosidl-typesupport-introspection-cpp"
SRC_URI = "https://github.com/ros2-gbp/rosidl_defaults-release/archive/release/crystal/rosidl_default_runtime/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5264758b72c586f614e5438ebe3c5956"
SRC_URI[sha256sum] = "8b856ffb15bc3153f89f51d87b1606568d2702cd87f00c30f39f8b65e24142ad"
S = "${WORKDIR}/rosidl_defaults-release-release-crystal-rosidl_default_runtime-0.6.0-0"

inherit ament


