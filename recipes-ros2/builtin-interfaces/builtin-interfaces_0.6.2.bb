# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing builtin message and service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/crystal/builtin_interfaces/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4bee9783f21fbd7e0f7112d790441182"
SRC_URI[sha256sum] = "4fa774e1c1870913e0e3badc6a7988472558050aab46f620fc90a5e94d8c4bbe"
S = "${WORKDIR}/rcl_interfaces-release-release-crystal-builtin_interfaces-0.6.2-0"

inherit ament pythonpath-insane
