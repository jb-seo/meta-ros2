# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some standard service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/std_srvs/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9fa21a0e33959895caedbdc65ec01515"
SRC_URI[sha256sum] = "5ad2af5b2ba28b71b6759bd14e4a10253e2e4bb0f790f2b36a3f8fe9fda0794b"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-std_srvs-0.5.1-0"


inherit ros
inherit ament

