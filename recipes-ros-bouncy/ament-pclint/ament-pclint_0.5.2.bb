# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to perform static code analysis on C/C++ code using pclint     and generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_pclint/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b4e514be5590cb578b6c3ee66c2e6aa7"
SRC_URI[sha256sum] = "e9212c4940298facaf7f1881fba6c98949e7f11e30ac963869412a5172226e93"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_pclint-0.5.2-0"


inherit ros
inherit setuptools3

BBCLASSEXTEND += "native"