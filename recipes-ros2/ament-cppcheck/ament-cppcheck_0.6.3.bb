# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to perform static code analysis on C/C++ code using Cppcheck     and generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "cppcheck"
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/crystal/ament_cppcheck/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a78b47653ba9a16b520a9da10dcbeaf6"
SRC_URI[sha256sum] = "85becd29a256589f650bc547981e6c9369be4b786785b066215124b6f31e9caa"
S = "${WORKDIR}/ament_lint-release-release-crystal-ament_cppcheck-0.6.3-0"

BBCLASSEXTEND += "native"
inherit ros-bpn cmake python3native
