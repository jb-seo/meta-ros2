# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ability to check code against the Google style conventions using     cpplint and generate xUnit test result files."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/ament_lint-release/archive/release/bouncy/ament_cpplint/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f5628fe1bb31e882a03844bf40afd7b1"
SRC_URI[sha256sum] = "63a3af80d6f89fe43ee59ad9c95ef1b011056941f9ed26dcf6f895bfbbf491ed"
S = "${WORKDIR}/ament_lint-release-release-bouncy-ament_cpplint-0.5.2-0"


inherit ros
inherit setuptools3

BBCLASSEXTEND += "native"